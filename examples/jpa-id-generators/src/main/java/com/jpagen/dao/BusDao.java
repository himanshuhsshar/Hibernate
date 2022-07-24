package com.jpagen.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.jpagen.entities.Bus;
import com.jpagen.helper.EntityManagerFactoryRegistry;

public class BusDao {

	public int saveBus(Bus bus) {
		EntityTransaction entityTransaction = null;
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		int busNo = 0;
		boolean flag = false;
		try {

			entityManagerFactory = EntityManagerFactoryRegistry.getEntityManagerFactory("bus_mysql_pu");

			/*
			 * entityManagerFactory =
			 * EntityManagerFactoryRegistry.getEntityManagerFactory("bus_oracle_pu");
			 */
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(bus);
			busNo = bus.getBusNo();
			flag = true;

		} finally {
			if (entityTransaction != null) {
				if (flag) {
					entityTransaction.commit();
				} else {
					entityTransaction.rollback();
				}
			}
			if (entityManager != null) {
				entityManager.close();
			}
		}
		return busNo;
	}

}
