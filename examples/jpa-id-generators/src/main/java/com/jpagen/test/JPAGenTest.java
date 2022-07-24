package com.jpagen.test;

import com.jpagen.dao.BusDao;
import com.jpagen.entities.Bus;
import com.jpagen.helper.EntityManagerFactoryRegistry;

public class JPAGenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BusDao busDao = new BusDao();
			Bus bus = new Bus();
			bus.setBusType("Semi-Sleeper");
			bus.setCapacity(36);
			bus.setColor("blue");
			bus.setFuelType("diesel");
			bus.setRegistrationNo("TS49738B");
			int busNo = busDao.saveBus(bus);
			System.out.println("Bus No : " + busNo);
		} finally {
			EntityManagerFactoryRegistry.closeEntityManagerFactory("bus_mysql_pu");
		}

	}

}
