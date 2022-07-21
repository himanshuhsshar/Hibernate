package com.hb3bs.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hb3bs.entities.Policy;
import com.hb3bs.helper.ProgrammaticSessionFactoryRegistry;
import com.hb3bs.helper.PropsSessionFactoryRegistry;
import com.hb3bs.helper.XmlSessionFactoryRegistry;

public class PolicyDao {
	
	public Policy getPolicy(int policyNo) {
		Policy policy = null;
		Session session = null;
		SessionFactory sessionFactory = null;
		
		try {
			//sessionFactory = PropsSessionFactoryRegistry.getSessionFactory();   // properties approach
			//sessionFactory = XmlSessionFactoryRegistry.getSessionFactory();       // xml-based configuration approach
			sessionFactory = ProgrammaticSessionFactoryRegistry.getSessionFactory();    // programmatic approach
			session = sessionFactory.openSession();
			policy = session.get(Policy.class, policyNo);
			
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		return policy;
	}

}
