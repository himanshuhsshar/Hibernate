package com.onetomanyset.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.onetomanyset.entities.BikeRegistration;
import com.onetomanyset.entities.TrafficChallan;
import com.onetomanyset.helper.SessionFactoryRegistry;

public class OneToManySetTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		boolean flag = false;
		int planNo = 0;
		TrafficChallan trafficChallan1 = null;
		TrafficChallan trafficChallan2 = null;
		BikeRegistration bikeRegistration = null;
		Set<TrafficChallan> trafficChallans = null;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			trafficChallans = new HashSet<TrafficChallan>();
			trafficChallan1 = new TrafficChallan();
			trafficChallan1.setViolationType("Speeding");
			trafficChallan1.setDescription("Over Speeding");
			trafficChallan1.setIssuedDate(new Date());
			trafficChallan1.setAmount(1200);
			trafficChallans.add(trafficChallan1);
			session.save(trafficChallan1);

			trafficChallan2 = new TrafficChallan();
			trafficChallan2.setViolationType("Helmet");
			trafficChallan2.setDescription("No Helmet");
			trafficChallan2.setIssuedDate(new Date());
			trafficChallan2.setAmount(500);
			trafficChallans.add(trafficChallan2);
			session.save(trafficChallan2);

			bikeRegistration = new BikeRegistration();
			bikeRegistration.setModelName("Apache RTR");
			bikeRegistration.setManufacturer("TVS");
			bikeRegistration.setPurchaseDate(new Date());
			bikeRegistration.setRegistrationNo("TS 09 BB 9833");
			bikeRegistration.setChasisNo("CH34643");
			bikeRegistration.setEngineNo("E-10017");
			bikeRegistration.setOwnerName("Philip");
			bikeRegistration.setTrafficChallans(trafficChallans);
			session.save(bikeRegistration);

			/*
			 * bikeRegistration = session.get(BikeRegistration.class, 1);
			 * System.out.println(bikeRegistration);
			 */
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

}
