package com.hb3bs.helper;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProgrammaticSessionFactoryRegistry {
	
	private static SessionFactory sessionFactory;
	
	static {
		try {
			Configuration configuration = new Configuration();
			configuration.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
			configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibdb");
			configuration.setProperty("hibernate.connection.username", "Himanshu");
			configuration.setProperty("hibernate.connection.password", "Himanshu@1234");
			configuration.setProperty("hibernate.show_sql", "true");
			configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
			configuration.addResource("com/hb3bs/entities/Policy.hbm.xml");
			//System.out.println("Hello");
			
			sessionFactory = configuration.buildSessionFactory();
			//System.out.println("Hello");
		} catch(HibernateException e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public static void closeSessionFactory() {
		if(sessionFactory!=null) {
			sessionFactory.close();
		}
	}

}
