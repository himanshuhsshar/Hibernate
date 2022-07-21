package com.criteriaapi.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

import com.criteriaapi.entities.BikeRegistration;
import com.criteriaapi.entities.BikeRegistration_;
import com.criteriaapi.entities.Journey;
import com.criteriaapi.entities.Journey_;
import com.criteriaapi.entities.TrafficChallan;
import com.criteriaapi.entities.TrafficChallan_;
import com.criteriaapi.helper.EntityManagerFactoryRegistry;

public class CriteriaApiTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;

		try {
			entityManagerFactory = EntityManagerFactoryRegistry.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			// showJourneys(entityManager);
			// showJourneyHoursByJourneyNo(entityManager, 1);
			// showJourneysByHoursandCommuteMode(entityManager, 3, "road");
			// showNoOfJourneysByCommuteMode(entityManager, "road");
			// showNoOfJourneysFromSource(entityManager, "road");
			// showNoOfJourneysBetweenSourceAndDestination(entityManager, "Hyderabad",
			// "Delhi");
			// showJourneysByMinimumHours(entityManager, 10);
			// showBikeRegistrationsByViolationType(entityManager, "helmet");
			showTrafficChallansByBikeModelName(entityManager, "Apache RTR");

		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
			EntityManagerFactoryRegistry.closeEntityManagerFactory();

		}
	}

	private static void showJourneys(EntityManager entityManager) {
		CriteriaQuery<Journey> criteriaQuery = null;
		TypedQuery<Journey> typedQuery = null;
		CriteriaBuilder criteriaBuilder = null;

		criteriaBuilder = entityManager.getCriteriaBuilder();
		criteriaQuery = criteriaBuilder.createQuery(Journey.class);
		Root<Journey> root = criteriaQuery.from(Journey.class);
		criteriaQuery.select(root);

		typedQuery = entityManager.createQuery(criteriaQuery);
		List<Journey> journeys = typedQuery.getResultList();
		printJourneys(journeys);

	}

	private static void showJourneyHoursByJourneyNo(EntityManager entityManager, int journeyNo) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Integer> criteriaQuery = criteriaBuilder.createQuery(Integer.class);
		Root<Journey> root = criteriaQuery.from(Journey.class);
		criteriaQuery.select(root.get("hours"));
		// criteriaQuery.where(criteriaBuilder.greaterThanOrEqualTo(root.get("journeyNo"),
		// journeyNo));
		criteriaQuery.where(criteriaBuilder.equal(root.get("journeyNo"), journeyNo));
		TypedQuery<Integer> typedQuery = entityManager.createQuery(criteriaQuery);
		typedQuery.getResultList().stream().forEach(System.out::println);
	}

	public static void showJourneysByHoursandCommuteMode(EntityManager entityManager, int hours, String commuteMode) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);

		Root<Journey> root = criteriaQuery.from(Journey.class);
		criteriaQuery.multiselect(root.get("source"), root.get("destination"));
		criteriaQuery.where(criteriaBuilder.and(criteriaBuilder.equal(root.get("hours"), hours),
				criteriaBuilder.equal(root.get("commuteMode"), commuteMode)));
		TypedQuery<Object[]> typedQuery = entityManager.createQuery(criteriaQuery);
		List<Object[]> records = typedQuery.getResultList();
		records.stream().forEach(
				(record) -> System.out.println("Source is : " + record[0] + " and Destination is : " + record[1]));
	}

	private static void showNoOfJourneysByCommuteMode(EntityManager entityManager, String commuteMode) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Long> criteriaQuery = criteriaBuilder.createQuery(Long.class);
		Root<Journey> root = criteriaQuery.from(Journey.class);
		criteriaQuery.multiselect(criteriaBuilder.count(root));
		criteriaQuery.where(criteriaBuilder.equal(root.get("commuteMode"), commuteMode));
		TypedQuery<Long> typedQuery = entityManager.createQuery(criteriaQuery);
		typedQuery.getResultList().forEach(System.out::println);
	}

	private static void showNoOfJourneysFromSource(EntityManager entityManager, String commuteMode) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);
		Root<Journey> root = criteriaQuery.from(Journey.class);
		criteriaQuery.multiselect(root.get("source"), criteriaBuilder.count(root.get("source")));
		criteriaQuery.groupBy(root.get("source"));
		// criteriaQuery.having(criteriaBuilder.equal(root.get("source"), source));
		criteriaQuery.where(criteriaBuilder.equal(root.get("commuteMode"), commuteMode));
		TypedQuery<Object[]> typedQuery = entityManager.createQuery(criteriaQuery);
		typedQuery.getResultList().stream()
				.forEach((record) -> System.out.println("Source : " + record[0] + " count  : " + record[1]));
	}

	private static void showNoOfJourneysBetweenSourceAndDestination(EntityManager entityManager, String source,
			String destination) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Long> criteriaQuery = criteriaBuilder.createQuery(Long.class);
		Root<Journey> root = criteriaQuery.from(Journey.class);
		criteriaQuery.multiselect(criteriaBuilder.count(root.get("journeyNo")));
		criteriaQuery.where(criteriaBuilder.and(criteriaBuilder.equal(root.get("source"), source),
				criteriaBuilder.equal(root.get("destination"), destination)));
		TypedQuery<Long> typedQuery = entityManager.createQuery(criteriaQuery);
		typedQuery.getResultList().forEach(System.out::println);
	}

	private static void showJourneysByMinimumHours(EntityManager entityManager, int hours) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);

		Root<Journey> root = criteriaQuery.from(Journey.class);
		criteriaQuery.multiselect(root.get(Journey_.SOURCE), root.get(Journey_.DESTINATION));
		criteriaQuery.where(criteriaBuilder.greaterThanOrEqualTo(root.get(Journey_.HOURS), hours));
		TypedQuery<Object[]> typedQuery = entityManager.createQuery(criteriaQuery);
		typedQuery.getResultList()
				.forEach((record) -> System.out.println("Source : " + record[0] + " Destionation  : " + record[1]));
	}

	private static void showBikeRegistrationsByViolationType(EntityManager entityManager, String violationType) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<BikeRegistration> criteriaQuery = criteriaBuilder.createQuery(BikeRegistration.class);
		Root<BikeRegistration> root = criteriaQuery.from(BikeRegistration.class);
		Join<BikeRegistration, TrafficChallan> join = root.join(BikeRegistration_.TRAFFIC_CHALLANS);
		criteriaQuery.where(criteriaBuilder.equal(join.get(TrafficChallan_.VIOLATION_TYPE), violationType));
		TypedQuery<BikeRegistration> typedQuery = entityManager.createQuery(criteriaQuery);
		typedQuery.getResultList().forEach(System.out::println);
	}

	private static void showTrafficChallansByBikeModelName(EntityManager entityManager, String bikeModelName) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<TrafficChallan> criteriaQuery = criteriaBuilder.createQuery(TrafficChallan.class);
		Root<TrafficChallan> root = criteriaQuery.from(TrafficChallan.class);
		criteriaQuery.select(root);
		Join<TrafficChallan, BikeRegistration> join = root.join(TrafficChallan_.BIKE_REGISTRATION);
		criteriaQuery.where(criteriaBuilder.equal(join.get(BikeRegistration_.MODEL_NAME), bikeModelName));
		TypedQuery<TrafficChallan> typedQuery = entityManager.createQuery(criteriaQuery);
		typedQuery.getResultList().forEach(System.out::println);
	}

	private static void printJourneys(List<Journey> journeys) {
		for (Journey journey : journeys) {
			System.out.println(journey);
		}
	}
}
