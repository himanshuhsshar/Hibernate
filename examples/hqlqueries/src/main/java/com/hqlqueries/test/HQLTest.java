package com.hqlqueries.test;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hqlqueries.dto.TripDto;
import com.hqlqueries.entities.BikeRegistration;
import com.hqlqueries.entities.Journey;
import com.hqlqueries.entities.TrafficChallan;
import com.hqlqueries.helper.SessionFactoryRegistry;

public class HQLTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			// showAllJourneys(session);
			// showAllTypedJourneys(session);
			// showJourneysOfDuration(session, 8);
			// showNoOfJourneysByCommuteMode(session, "road");
			// showJourneyHours(session, 1);
			/*
			 * List<TripDto> tripDtos = getTripsBetweenSourceAndDestination(session,
			 * "Hyderabad", "Bangalore"); for (TripDto tripDto : tripDtos) {
			 * System.out.println(tripDto); }
			 */

			// showJourneysBetweenAmount(session, 500, 5000000);
			// showNoOfJourneysBySourceAndJourneyDate(session, "Hyderabad");
			// showTrafficChallans(session, "TS 09 BB 9833");
			
			showBikeRegistrationsByViolationType(session, "helmet");
				
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			if (session != null) {
				session.close();
			}
			SessionFactoryRegistry.closeSessionFactory();
		}
	}

	private static void showAllJourneys(Session session) {
		Query query = null;
		query = session.createQuery("from Journey");
		List<Journey> journeys = query.getResultList();
		printJourneys(journeys);
	}

	private static void showAllTypedJourneys(Session session) {
		TypedQuery<Journey> typedQuery = null;
		typedQuery = session.createQuery("from Journey", Journey.class);
		List<Journey> journeys = typedQuery.getResultList();
		printJourneys(journeys);
	}

	private static void showJourneysOfDuration(Session session, int hours) {
		TypedQuery<Journey> typedQuery = null;
		typedQuery = session.createQuery("from Journey j where j.hours > :hours", Journey.class);
		typedQuery.setParameter("hours", hours);
		List<Journey> journeys = typedQuery.getResultList();
		printJourneys(journeys);
	}

	private static void showNoOfJourneysByCommuteMode(Session session, String commuteMode) {
		TypedQuery<Long> typedQuery = null;
		typedQuery = session.createQuery("select count(j) from Journey j where j.commuteMode = :commuteMode",
				Long.class);
		typedQuery.setParameter("commuteMode", commuteMode);
		List<Long> journeys = typedQuery.getResultList();
		System.out.println("No Of Journeys : " + journeys.get(0) + " for commute mode " + commuteMode);
	}

	private static void showJourneyHours(Session session, int journeyNo) {
		TypedQuery<Integer> typedQuery = null;
		typedQuery = session.createQuery("select j.hours from Journey j where j.journeyNo = :journeyNo", Integer.class);
		typedQuery.setParameter("journeyNo", journeyNo);
		List<Integer> journeys = typedQuery.getResultList();
		System.out.println("Journey Hours : " + journeys.get(0));
	}

	private static List<TripDto> getTripsBetweenSourceAndDestination(Session session, String source,
			String destination) {
		List<TripDto> tripDtos = null;
		TypedQuery<TripDto> typedQuery = null;
		typedQuery = session.createQuery(
				"select new com.hqlqueries.dto.TripDto(j.journeyNo, j.source, j.destination, j.amount) from Journey j where j.source = :source and j.destination = :destination",
				TripDto.class);
		typedQuery.setParameter("source", source);
		typedQuery.setParameter("destination", destination);
		tripDtos = typedQuery.getResultList();
		return tripDtos;
	}

	private static void showJourneysBetweenAmount(Session session, double minAmount, double maxAmount) {
		TypedQuery<Object[]> typedQuery = session.createQuery(
				"select j.source,j.destination,j.journeyDate from Journey j where j.amount between :minAmount and :maxAmount",
				Object[].class);
		typedQuery.setParameter("minAmount", minAmount);
		typedQuery.setParameter("maxAmount", maxAmount);
		List<Object[]> records = typedQuery.getResultList();
		for (Object[] record : records) {
			System.out.println("Source : " + record[0] + " Destination : " + record[1] + " JourneyDate: " + record[2]);
		}
	}

	private static void showNoOfJourneysBySourceAndJourneyDate(Session session, String source) {
		TypedQuery<Object[]> typedQuery = session.createQuery(
				"select j.source, count(j.source) from Journey j group by j.source having j.source=:source",
				Object[].class);
		typedQuery.setParameter("source", source);
		List<Object[]> records = typedQuery.getResultList();
		for (Object[] record : records) {
			System.out.println("Source : " + record[0] + " Trips : " + record[1]);
		}
	}

	private static void showTrafficChallans(Session session, String registrationNo) {
		TypedQuery<TrafficChallan> typedQuery = session.createQuery(
				"select tc from TrafficChallan tc where tc.bikeRegistration.registrationNo=:registrationNo",
				TrafficChallan.class);
		typedQuery.setParameter("registrationNo", registrationNo);
		List<TrafficChallan> trafficChallans = typedQuery.getResultList();
		for (TrafficChallan trafficChallan : trafficChallans) {
			System.out.println(trafficChallan);
		}
	}

	private static void showBikeRegistrationsByViolationType(Session session, String violationType) {
		TypedQuery<BikeRegistration> typedQuery = session.createQuery(
				"select br from BikeRegistration br inner join br.trafficChallans tc where tc.violationType=:violationType",
				BikeRegistration.class);
		typedQuery.setParameter("violationType", violationType);
		List<BikeRegistration> bikeRegistrations = typedQuery.getResultList();
		for (BikeRegistration bikeRegistration : bikeRegistrations) {
			System.out.println(bikeRegistration);
		}
	}

	private static void printJourneys(List<Journey> journeys) {
		for (Journey journey : journeys) {
			System.out.println(journey);
		}
	}
}
