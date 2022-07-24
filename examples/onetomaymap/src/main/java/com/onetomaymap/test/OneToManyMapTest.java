package com.onetomaymap.test;

import java.time.LocalDate;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.onetomaymap.entities.CourierCenter;
import com.onetomaymap.entities.Parcel;
import com.onetomaymap.helper.SessionFactoryRegistry;

public class OneToManyMapTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Parcel parcel1 = Parcel.builder().description("Documents").source("Delhi").description("Gwalior")
					.parcelDate(LocalDate.now()).shippingAmount(450).weight(10).build();

			Parcel parcel2 = Parcel.builder().description("Books").source("Pune").description("Delhi")
					.parcelDate(LocalDate.now()).shippingAmount(150).weight(5).build();

			session.save(parcel1);
			session.save(parcel2);

			Map<String, Parcel> parcels = Map.of("AWB9867", parcel1, "AWB57303", parcel2);
			CourierCenter courierCenter = CourierCenter.builder().centerName("Bluedart Center").contactNo("9983453729")
					.emailAddress("enquiries@bluedart.com").inChargeName("Smith").location("AmeerPeet").parcels(parcels)
					.build();
			session.save(courierCenter);

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
