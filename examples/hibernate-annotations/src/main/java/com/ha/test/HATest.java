package com.ha.test;

import com.ha.dao.StaffDao;
import com.ha.entities.Staff;
import com.ha.helper.SessionFactoryRegistry;

public class HATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			StaffDao staffDao = new StaffDao();
			Staff staff = staffDao.getStaff(1);
			System.out.println(staff);
		} finally {
			if(SessionFactoryRegistry.getSessionFactory()!=null) {
				SessionFactoryRegistry.closeSessionFactory();
			}
		}
		

	}

}
