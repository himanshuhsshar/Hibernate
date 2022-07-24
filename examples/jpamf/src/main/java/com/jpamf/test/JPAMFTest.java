package com.jpamf.test;

import com.jpamf.dao.SubscriberDao;
import com.jpamf.entities.Subscriber;
import com.jpamf.helper.EntityManagerFactoryRegistry;

public class JPAMFTest {
	
	public static void main(String[] args) {
		try {
			SubscriberDao subscriberDao = new SubscriberDao();
			Subscriber subscriber = subscriberDao.getSubscriber(1);
			System.out.println(subscriber);
		} finally {
			if(EntityManagerFactoryRegistry.getEntityManagerFactory()!=null) {
				EntityManagerFactoryRegistry.closeEntityManagerFactory();
			}
		}
	}

}
