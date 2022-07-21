package com.ck.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ck.entities.LoanApplication;
import com.ck.entities.LoanApplicationNo;
import com.ck.helper.SessionFactoryRegistry;

public class LoanApplicationDao {
	
	public LoanApplication getLoanApplication(LoanApplication pk) {
		SessionFactory sessionFactory = null;
		Session session = null;
		LoanApplication loanApplication = null;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			loanApplication = session.get(LoanApplication.class, pk);
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		return loanApplication;
	}
	public LoanApplication getLoanApplication(LoanApplicationNo loanApplicationNo) {
		SessionFactory sessionFactory = null;
		Session session = null;
		LoanApplication loanApplication = null;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			loanApplication = session.get(LoanApplication.class, loanApplicationNo);
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		return loanApplication;
	}

}
