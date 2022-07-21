package com.getvsload.dao;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.getvsload.entities.Customer;
import com.getvsload.entities.ICustomer;
import com.getvsload.helper.SessionFactoryRegistry;

public class CustomerDao {
	
	public Customer getCustomer(int customerNo) {
		Customer customer = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			customer = session.get(Customer.class, customerNo);
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		return customer;
	}

	/*
	 * public Customer loadCustomer(int customerNo) { Customer customer = null;
	 */
	public ICustomer loadCustomer(int customerNo) {
		ICustomer customer = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			customer = session.load(Customer.class, customerNo);
			/*
			 * System.out.println("Customer No : " + customer.getCustomerNo());
			 * System.out.println("Customer class : " + customer.getClass().getName());
			 * System.out.println("Customer Name : " + customer.getCustomerName());
			 * System.out.println("Gender : " + customer.getGender());
			 */
			/*
			 * System.out.println("customer == null ? " + (customer == null)); String
			 * customerName = customer.getCustomerName();
			 */
			/*
			 * System.out.println("Customer class : " + customer.getClass().getName());
			 * String customerName = customer.getCustomerName();
			 * System.out.println("Customer Name : " + customerName);
			 */
			System.out.println("Customer class : " + customer.getClass().getName());
			/*
			 * String customerName = customer.getCustomerName();
			 * System.out.println("Customer Name : " + customerName);
			 */
		} catch(ObjectNotFoundException e) {
			// eat the exception
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		return customer;
	}

}
