package com.jpamf.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.jpamf.entities.Subscriber;
import com.jpamf.helper.EntityManagerFactoryRegistry;

public class SubscriberDao {

	public Subscriber getSubscriber(int subscriberNo) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		Subscriber subscriber = null;

		try {
			entityManagerFactory = EntityManagerFactoryRegistry.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			subscriber = entityManager.find(Subscriber.class, subscriberNo);
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
		return subscriber;
	}
}
