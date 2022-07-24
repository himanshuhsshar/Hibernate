package com.inverse.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.inverse.entities.DeliveryAssociate;
import com.inverse.entities.Parcel;
import com.inverse.helper.SessionFactoryRegistry;

public class InverseTest {

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
			 * Set<Parcel> parcels = new HashSet<>(); DeliveryAssociate deliveryAssociate =
			 * DeliveryAssociate.builder().associateName("Tom")
			 * .contactNo("9847392930").experience(5).designation("Delivery Agent").parcels(
			 * parcels).build(); session.save(deliveryAssociate);
			 * 
			 * Parcel parcel1 =
			 * Parcel.builder().deliveryType("Expedite").weight(23).description("documents")
			 * .charges(230) .deliveryAssociate(deliveryAssociate).build();
			 * parcels.add(parcel1); session.save(parcel1);
			 */

			/*
			 * DeliveryAssociate deliveryAssociate = session.get(DeliveryAssociate.class,
			 * 1); System.out.println(deliveryAssociate.getAssociateName());
			 * 
			 * Set<Parcel> parcels = deliveryAssociate.getParcels();
			 * System.out.println(parcels.getClass().getName()); for(Parcel parcel :
			 * parcels) { System.out.println(parcel); }
			 */

			Query query = session.createQuery("Select da from DeliveryAssociate da where da.experience>=:exp");
			query.setParameter("exp", 1);

			List<DeliveryAssociate> deliveryAssociates = query.getResultList();
			for (DeliveryAssociate deliveryAssociate : deliveryAssociates) {
				System.out.println("Associate Name : " + deliveryAssociate.getAssociateName());

				System.out.println("Parcels : ");
				Set<Parcel> parcels = deliveryAssociate.getParcels();
				for (Parcel parcel : parcels) {
					System.out.println(parcel);
				}

			}

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
