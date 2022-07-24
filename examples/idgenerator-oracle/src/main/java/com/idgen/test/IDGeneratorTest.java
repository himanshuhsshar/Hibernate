package com.idgen.test;

import com.idgen.dao.VehicleDao;
import com.idgen.entities.Vehicle;
import com.idgen.helper.SessionFactoryRegistry;

public class IDGeneratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			VehicleDao vehicleDao = new VehicleDao();
			Vehicle vehicle = new Vehicle();
			vehicle.setModelName("mustang");
			vehicle.setManufacturer("Ford");
			vehicle.setRegistrationNo("TS08AP9384");
			vehicle.setColor("Yellow");
			vehicle.setFuelType("Petrol");
			vehicle.setLeaseAmount(35000);
			String vno = vehicleDao.saveVehicle(vehicle);

			System.out.println("Vehicle No : " + vno);

		} finally {
			SessionFactoryRegistry.closeSessionFactory();
		}

	}

}
