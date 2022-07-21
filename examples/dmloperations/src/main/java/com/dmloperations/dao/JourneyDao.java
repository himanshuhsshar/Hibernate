package com.dmloperations.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dmloperations.entities.Journey;

public class JourneyDao {

	public int saveJourney(Journey journey) {
		boolean flag = false;
		Session session = null;
		Transaction transaction = null;
		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		try {
			configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			int journeyNo = (int) session.save(journey);
			flag = true;
			return journeyNo;
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
		}
	}

	/*
	 * public void saveJourney(Journey journey) { boolean flag = false; Session
	 * session = null; Transaction transaction = null; Configuration configuration =
	 * null; SessionFactory sessionFactory = null; try { configuration = new
	 * Configuration().configure(); sessionFactory =
	 * configuration.buildSessionFactory(); session = sessionFactory.openSession();
	 * transaction = session.beginTransaction(); session.persist(journey); int
	 * eJourneyNo = journey.getJourneyNo();
	 * System.out.println("Entity Journey No : " + eJourneyNo); flag = true; }
	 * finally { if (transaction != null) { if (flag) { transaction.commit(); } else
	 * { transaction.rollback(); } } if (session != null) { session.close(); } }
	 * 
	 * }
	 */
	/*
	 * public void saveJourney(Journey journey) { boolean flag = false; Session
	 * session = null; Transaction transaction = null; Configuration configuration =
	 * null; SessionFactory sessionFactory = null; try { configuration = new
	 * Configuration().configure(); sessionFactory =
	 * configuration.buildSessionFactory(); session = sessionFactory.openSession();
	 * transaction = session.beginTransaction(); session.saveOrUpdate(journey); flag
	 * = true; } finally { if (transaction != null) { if (flag) {
	 * transaction.commit(); } else { transaction.rollback(); } } if (session !=
	 * null) { session.close(); } }
	 * 
	 * }
	 */

	/*
	 * public void updateJourney() { boolean flag = false; Session session = null;
	 * Transaction transaction = null; Configuration configuration = null;
	 * SessionFactory sessionFactory = null; Journey journey = null; try {
	 * configuration = new Configuration().configure(); sessionFactory =
	 * configuration.buildSessionFactory(); session = sessionFactory.openSession();
	 * transaction = session.beginTransaction(); journey =
	 * session.get(Journey.class, 6); journey.setDestination("Mumbai");
	 * session.update(journey); flag = true; } finally { if (transaction != null) {
	 * if (flag) { transaction.commit(); } else { transaction.rollback(); } } if
	 * (session != null) { session.close(); } }
	 * 
	 * }
	 */

	/*
	 * public void updateJourney(Journey journey) { boolean flag = false; Session
	 * session = null; Transaction transaction = null; Configuration configuration =
	 * null; SessionFactory sessionFactory = null; try { configuration = new
	 * Configuration().configure(); sessionFactory =
	 * configuration.buildSessionFactory(); session = sessionFactory.openSession();
	 * transaction = session.beginTransaction(); session.update(journey); flag =
	 * true; } finally { if (transaction != null) { if (flag) {
	 * transaction.commit(); } else { transaction.rollback(); } } if (session !=
	 * null) { session.close(); } }
	 * 
	 * }
	 */
	/*
	 * public void mergeJourney() { boolean flag = false; Session session = null;
	 * Transaction transaction = null; Configuration configuration = null;
	 * SessionFactory sessionFactory = null; Journey journey = null; try {
	 * configuration = new Configuration().configure(); sessionFactory =
	 * configuration.buildSessionFactory(); session = sessionFactory.openSession();
	 * transaction = session.beginTransaction(); journey =
	 * session.get(Journey.class, 1); Journey journey1 = new Journey();
	 * journey1.setJourneyNo(journey.getJourneyNo());
	 * journey1.setSource(journey.getSource());
	 * journey1.setDestination(journey.getDestination());
	 * journey1.setCommuteMode("Air"); journey1.setHours(1);
	 * journey1.setJourneyDate(journey.getJourneyDate());
	 * journey1.setAmount(journey.getAmount()); session.update(journey1);
	 * session.merge(journey1); flag = true; } finally { if (transaction != null) {
	 * if (flag) { transaction.commit(); } else { transaction.rollback(); } } if
	 * (session != null) { session.close(); } }
	 * 
	 * }
	 */
	/*
	 * public void deleteJourney() { boolean flag = false; Session session = null;
	 * Transaction transaction = null; Configuration configuration = null;
	 * SessionFactory sessionFactory = null; Journey journey = null; try {
	 * configuration = new Configuration().configure(); sessionFactory =
	 * configuration.buildSessionFactory(); session = sessionFactory.openSession();
	 * transaction = session.beginTransaction(); journey =
	 * session.get(Journey.class, 1); session.delete(journey); flag = true; }
	 * finally { if (transaction != null) { if (flag) { transaction.commit(); } else
	 * { transaction.rollback(); } } if (session != null) { session.close(); } }
	 * 
	 * }
	 */
	/*
	 * public void deleteJourney(Journey journey) { boolean flag = false; Session
	 * session = null; Transaction transaction = null; Configuration configuration =
	 * null; SessionFactory sessionFactory = null; try { configuration = new
	 * Configuration().configure(); sessionFactory =
	 * configuration.buildSessionFactory(); session = sessionFactory.openSession();
	 * transaction = session.beginTransaction(); session.delete(journey); flag =
	 * true; } finally { if (transaction != null) { if (flag) {
	 * transaction.commit(); } else { transaction.rollback(); } } if (session !=
	 * null) { session.close(); } }
	 * 
	 * }
	 */

}
