package com.hbmddlproperty.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbmddlproperty.dao.TicketDao;
import com.hbmddlproperty.entities.Ticket;
import com.hbmddlproperty.helper.SessionFactoryRegistry;

public class HBMDDLPropertyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ticket ticket = null;
		TicketDao ticketDao = null;
		try {
			ticket = new Ticket();
			ticket.setSource("Hyderabad");
			ticket.setDestination("Bangalore");
			ticket.setSeatNo(23);
			ticket.setJourneyDate(new Date());
			ticket.setPassengerName("Himanshu Sharma");
			ticket.setAmount(2000);
			ticket.setCoachNo("S3");
			ticketDao = new TicketDao();
			String ticketNo = ticketDao.insertTicket(ticket);
			System.out.println("Ticket No : " + ticketNo);
		} finally {
			SessionFactoryRegistry.closeSessionFactory();
		}

		/*
		 * Ticket ticket = null; boolean flag = false; Session session = null;
		 * Transaction transaction = null; Configuration configuration = null;
		 * SessionFactory sessionFactory = null; try { configuration = new
		 * Configuration().configure(); sessionFactory =
		 * configuration.buildSessionFactory(); session = sessionFactory.openSession();
		 * transaction = session.beginTransaction(); ticket = new Ticket();
		 * ticket.setSource("Hyderabad"); ticket.setDestination("Bangalore");
		 * ticket.setSeatNo(23); ticket.setJourneyDate(new Date());
		 * ticket.setPassengerName("Himanshu Sharma"); ticket.setAmount(2000);
		 * ticket.setCoachNo("S3"); String ticketNo = (String) session.save(ticket);
		 * System.out.println("Ticket No : " + ticketNo); flag = true; } finally { if
		 * (transaction != null) { if (flag) { transaction.commit(); } else {
		 * transaction.rollback(); } } if (session != null) { session.close(); } if
		 * (sessionFactory != null) { sessionFactory.close(); }
		 * 
		 * }
		 */
	}

}
