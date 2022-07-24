package com.st.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryRegistry {
	
	private static EntityManagerFactory entityManagerFactory;
	
	static {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("paymentPU");
		} catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
	
	public static void closeEntityManagerFactory() {
		if(entityManagerFactory!=null) {
			entityManagerFactory.close();
		}
	}

}
