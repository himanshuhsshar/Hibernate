package com.jpack.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.jpack.entities.EduScholarship;
import com.jpack.entities.EduScholarshipNo;
import com.jpack.helper.EntityManagerFactoryRegistry;

public class EduScholarshipDao {

	public EduScholarship getEduScholarship(EduScholarshipNo cpk) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EduScholarship eduScholarship = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistry.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			eduScholarship = entityManager.find(EduScholarship.class, cpk);
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
		return eduScholarship;
	}

}
