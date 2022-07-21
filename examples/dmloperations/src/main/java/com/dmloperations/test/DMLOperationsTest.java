package com.dmloperations.test;

import java.util.Date;

import com.dmloperations.dao.JourneyDao;
import com.dmloperations.entities.Journey;
import com.dmloperations.helper.SessionFactoryRegistry;

public class DMLOperationsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			Journey journey = new Journey();
			JourneyDao journeyDao = new JourneyDao();
			journey.setJourneyNo(-1);
			journey.setSource("Hyderabad");
			journey.setDestination("Delhi");
			journey.setJourneyDate(new Date());
			journey.setHours(10);
			journey.setCommuteMode("Bus");
			journey.setAmount(156000);

			int journeyNo = (int) journeyDao.saveJourney(journey);
			System.out.println("Journey No : " + journeyNo);
			int eJourneyNo = journey.getJourneyNo();
			System.out.println("Entity Journey No : " + eJourneyNo);

			/*
			 * JourneyDao journeyDao = new JourneyDao(); journeyDao.updateJourney();
			 */
			/*
			 * Journey journey = new Journey(); JourneyDao journeyDao = new JourneyDao();
			 * journey.setJourneyNo(1); journey.setSource("Hyderabad");
			 * journey.setDestination("Delhi"); journey.setJourneyDate(new Date());
			 * journey.setHours(10); journey.setCommuteMode("Train");
			 * journey.setAmount(156000); journeyDao.updateJourney(journey);
			 */
			/*
			 * JourneyDao journeyDao = new JourneyDao(); journeyDao.mergeJourney();
			 */
			/*
			 * JourneyDao journeyDao = new JourneyDao(); journeyDao.deleteJourney();
			 */
			/*
			 * JourneyDao journeyDao = new JourneyDao(); Journey journey = new Journey();
			 * journey.setJourneyNo(5); journeyDao.deleteJourney(journey );
			 */
			/*
			 * Journey journey = new Journey(); JourneyDao journeyDao = new JourneyDao();
			 * journey.setSource("Hyderabad"); journey.setDestination("Delhi");
			 * journey.setJourneyDate(new Date()); // journey.setHours(10); //
			 * journey.setCommuteMode("Bus"); journey.setAmount(156000); int journeyNo =
			 * (int) journeyDao.saveJourney(journey); System.out.println("Journey No : " +
			 * journeyNo); int eJourneyNo = journey.getJourneyNo();
			 * System.out.println("Entity Journey No : " + eJourneyNo);
			 */
			/*
			 * JourneyDao journeyDao = new JourneyDao(); journeyDao.updateJourney();
			 */

		} finally {
			SessionFactoryRegistry.closeSessionFactory();
		}
	}

}
