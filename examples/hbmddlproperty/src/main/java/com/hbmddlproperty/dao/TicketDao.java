package com.hbmddlproperty.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbmddlproperty.entities.Ticket;

public class TicketDao {

	public String insertTicket(Ticket ticket) {
		boolean flag = false;
		Session session = null;
		Transaction transaction = null;
		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		try {
			configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			String ticketNo = (String) session.save(ticket);
			flag=true;
			return ticketNo;
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
		}
		
	}

}
