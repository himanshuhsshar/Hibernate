package com.tpcc.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpcc.entities.AccidentalInsurancePlan;
import com.tpcc.entities.InsurancePlan;
import com.tpcc.entities.MedicalInsurancePlan;
import com.tpcc.helper.SessionFactoryRegistry;

public class TPCCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		boolean flag = false;
		try {

			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			/*
			 * InsurancePlan insurancePlan = new InsurancePlan();
			 * insurancePlan.setPlanName("Jeevan Saral");
			 * insurancePlan.setDescription("LifeSaver Plan");
			 * insurancePlan.setTaxSaver(true); insurancePlan.setMinInsurredAmount(10000);
			 * 
			 * int planNo = (Integer) session.save(insurancePlan);
			 * 
			 * System.out.println("Plan No : " + planNo);
			 */

			/*
			 * AccidentalInsurancePlan insurancePlan = new AccidentalInsurancePlan();
			 * insurancePlan.setPlanName("Jeevan Travel");
			 * insurancePlan.setDescription("LifeSaver Plan");
			 * insurancePlan.setTaxSaver(true); insurancePlan.setMinInsurredAmount(10000);
			 * insurancePlan.setCoverageType("International");
			 * insurancePlan.setDisabilityCoveragePercentage(50);
			 * 
			 * int planNo = (Integer) session.save(insurancePlan);
			 * 
			 * System.out.println("Plan No : " + planNo);
			 */

			/*
			 * MedicalInsurancePlan insurancePlan = new MedicalInsurancePlan();
			 * insurancePlan.setPlanName("Jeevan Abhaya");
			 * insurancePlan.setDescription("LifeSaver Plan");
			 * insurancePlan.setTaxSaver(true); insurancePlan.setMinInsurredAmount(10000);
			 * insurancePlan.setNetworkType("In-Network"); insurancePlan.setCopay(10);
			 * 
			 * int planNo = (Integer) session.save(insurancePlan);
			 * 
			 * System.out.println("Plan No : " + planNo);
			 */

			AccidentalInsurancePlan accidentalInsurancePlan = session.get(AccidentalInsurancePlan.class, 2);
			System.out.println(accidentalInsurancePlan);
			System.out.println("-------------------------------------------------------------------------");

			AccidentalInsurancePlan accidentalInsurancePlan1 = session.get(AccidentalInsurancePlan.class, 3);
			System.out.println(accidentalInsurancePlan1);
			System.out.println("-------------------------------------------------------------------------");

			MedicalInsurancePlan medicalInsurancePlan = session.get(MedicalInsurancePlan.class, 2);
			System.out.println(medicalInsurancePlan);
			System.out.println("-------------------------------------------------------------------------");

			MedicalInsurancePlan medicalInsurancePlan1 = session.get(MedicalInsurancePlan.class, 3);
			System.out.println(medicalInsurancePlan1);
			System.out.println("-------------------------------------------------------------------------");

			InsurancePlan insurancePlan = session.get(InsurancePlan.class, 1);
			System.out.println(insurancePlan);
			System.out.println("-------------------------------------------------------------------------");

			InsurancePlan insurancePlan1 = session.get(InsurancePlan.class, 2);
			System.out.println(insurancePlan1);
			System.out.println("-------------------------------------------------------------------------");

			InsurancePlan insurancePlan2 = session.get(InsurancePlan.class, 3);
			System.out.println(insurancePlan2);
			System.out.println("-------------------------------------------------------------------------");

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
