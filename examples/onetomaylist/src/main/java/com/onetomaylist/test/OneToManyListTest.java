package com.onetomaylist.test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.onetomaylist.entities.ServiceCenter;
import com.onetomaylist.entities.Token;
import com.onetomaylist.helper.SessionFactoryRegistry;

public class OneToManyListTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			/*
			 * Token token1 = Token.builder().serviceType("In_Warranty").problem("slow")
			 * .tokenIssuedDate(LocalDateTime.now()).customerName("Paul").mobileNo(
			 * "9876536789").build(); session.save(token1); Token token2 =
			 * Token.builder().serviceType("In_Warranty").problem("Network Issue")
			 * .tokenIssuedDate(LocalDateTime.now()).customerName("Peter").mobileNo(
			 * "9876536789").build(); session.save(token2); Token token3 =
			 * Token.builder().serviceType("In_Warranty").problem("Display Issue")
			 * .tokenIssuedDate(LocalDateTime.now()).customerName("Greg").mobileNo(
			 * "9876536789").build(); session.save(token3); Token token4 =
			 * Token.builder().serviceType("Out Of Warranty").problem("Battery Issue")
			 * .tokenIssuedDate(LocalDateTime.now()).customerName("Lisa").mobileNo(
			 * "9876536789").build(); session.save(token4);
			 * 
			 * List<Token> tokens1 = Arrays.asList(new Token[] { token1, token2 });
			 * ServiceCenter serviceCenter1 =
			 * ServiceCenter.builder().serviceCenterName("KPBH Center").company("Samsung")
			 * .branchManager("Tim").contactNo("9984454378").emailAddress("kpbh@gmail.com").
			 * location("Gwalior") .tokens(tokens1).build();
			 * 
			 * List<Token> tokens2 = Arrays.asList(new Token[] { token3, token4 });
			 * ServiceCenter serviceCenter2 =
			 * ServiceCenter.builder().serviceCenterName("abids Center").company("Samsung")
			 * .branchManager("Peter").contactNo("9984784378").emailAddress(
			 * "peter@gmail.com").location("Gwalior") .tokens(tokens2).build();
			 * 
			 * session.save(serviceCenter1); session.save(serviceCenter2);
			 */

			ServiceCenter serviceCenter = session.get(ServiceCenter.class, 1);
			System.out.println(serviceCenter);

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
