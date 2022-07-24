package com.jpatpc.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.jpatpc.entities.CardPayment;
import com.jpatpc.entities.ChequePayment;
import com.jpatpc.entities.Payment;
import com.jpatpc.helper.EntityManagerFactoryRegistry;

public class JPATPCTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		boolean flag = false;

		try {
			entityManagerFactory = EntityManagerFactoryRegistry.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			/*
			 * Payment payment = new Payment(); payment.setCustomerName("Jane Foster");
			 * payment.setDescription("Groceries Purchase"); payment.setPaymentDate(new
			 * Date()); payment.setPaidAmount(25000); entityManager.persist(payment);
			 * 
			 * int paymentNo = payment.getPaymentNo(); System.out.println("Payment No : " +
			 * paymentNo);
			 */

			/*
			 * CardPayment payment = new CardPayment();
			 * payment.setCustomerName("Jane Foster");
			 * payment.setDescription("Clothing Merchandise"); payment.setPaymentDate(new
			 * Date()); payment.setPaidAmount(25000);
			 * payment.setCardNo("3456 2354 3647 2463"); payment.setCardHolderName("Adam");
			 * payment.setExpiryDay(2); payment.setExpiryMonth(2024);
			 * payment.setIssuedBank("HDFC"); entityManager.persist(payment);
			 * 
			 * int paymentNo = payment.getPaymentNo(); System.out.println("Payment No : " +
			 * paymentNo);
			 */

			/*
			 * ChequePayment payment = new ChequePayment();
			 * payment.setCustomerName("Jane Foster");
			 * payment.setDescription("Fashion Jwellery"); payment.setPaymentDate(new
			 * Date()); payment.setPaidAmount(35000); payment.setPayeeName("Phillip");
			 * payment.setBankName("HDFC BANK"); payment.setBranchName("Jubliee Hills");
			 * payment.setChequeDate(new Date());
			 * payment.setChequeNo("3457 2637 4637 2637"); entityManager.persist(payment);
			 * 
			 * int paymentNo = payment.getPaymentNo(); System.out.println("Payment No : " +
			 * paymentNo);
			 */

			/*
			 * CardPayment payment = entityManager.find(CardPayment.class, 1);
			 * System.out.println(payment); CardPayment payment1 =
			 * entityManager.find(CardPayment.class, 2); System.out.println(payment1);
			 */

			/*
			 * ChequePayment payment = entityManager.find(ChequePayment.class, 1);
			 * System.out.println(payment); ChequePayment payment1 =
			 * entityManager.find(ChequePayment.class, 2); System.out.println(payment1);
			 */

			Payment payment = entityManager.find(Payment.class, 1);
			System.out.println(payment);
			Payment payment1 = entityManager.find(Payment.class, 1);
			System.out.println(payment1);
			Payment payment2 = entityManager.find(Payment.class, 2);
			System.out.println(payment2);

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
			EntityManagerFactoryRegistry.closeEntityManagerFactory();
		}
	}

}
