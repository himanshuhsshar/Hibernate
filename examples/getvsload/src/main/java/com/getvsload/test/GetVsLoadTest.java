package com.getvsload.test;

import com.getvsload.dao.CustomerDao;
import com.getvsload.entities.Customer;
import com.getvsload.entities.ICustomer;
import com.getvsload.helper.SessionFactoryRegistry;

public class GetVsLoadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		CustomerDao customerDao = new CustomerDao();
		/*
		 * Customer customer = customerDao.getCustomer(1); // Eager Loading
		 * //System.out.println(customer); System.out.println("Customer Name : " +
		 * customer.getCustomerName());
		 */
		/*
		 * Customer customer = customerDao.loadCustomer(1); // lazy loading
		 */	
		
		/*
		 * Customer customer = customerDao.getCustomer(10);
		 * System.out.println("customer == null ? " + (customer == null));
		 */
		/* Customer customer = customerDao.loadCustomer(10); */
		
		/*
		 * Customer customer = customerDao.getCustomer(10);
		 * System.out.println("customer == null ? " + (customer == null));
		 */
		
		/* Customer customer = customerDao.loadCustomer(10); */
		
		/* ICustomer customer = customerDao.loadCustomer(1); */
		
		
		  Customer customer = customerDao.getCustomer(1);
		  System.out.println("Customer Name : " +customer.getCustomerName());
		 
		
		/*
		 * ICustomer icustomer = customerDao.loadCustomer(1);
		 * System.out.println("Customer Name : " +icustomer.getCustomerName());
		 */
		
		} finally {
			if(SessionFactoryRegistry.getSessionFactory()!=null)
			{
				SessionFactoryRegistry.closeSessionFactory();
			}
		}
	}
	

}
