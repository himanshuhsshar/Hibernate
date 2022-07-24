package com.jpaonetomany.test;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.jpaonetomany.entities.Account;
import com.jpaonetomany.entities.Branch;
import com.jpaonetomany.helper.EntityManagerFactoryRegistry;

public class JpaOneToManyTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		boolean flag = false;
		try {
			entityManagerFactory = EntityManagerFactoryRegistry.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			/*
			 * Account account =
			 * Account.builder().accountHolderName("Frank").accountType("Savings").balance(
			 * 8000).build(); entityManager.persist(account);
			 * 
			 * Set<Account> accounts = Stream.of(new Account[] { account
			 * }).collect(Collectors.toSet());
			 * 
			 * Branch branch =
			 * Branch.builder().branchName("HDFC BANK").branchManager("Jack").location(
			 * "Gwalior").accounts(accounts).build(); entityManager.persist(branch);
			 */
			
			Branch branch = entityManager.find(Branch.class, 2);
			System.out.println(branch);
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

	}
}
