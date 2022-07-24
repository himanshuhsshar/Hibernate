package com.jpack.test;

import com.jpack.dao.EduScholarshipDao;
import com.jpack.entities.EduScholarship;
import com.jpack.entities.EduScholarshipNo;
import com.jpack.helper.EntityManagerFactoryRegistry;

public class JPACKTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			EduScholarshipNo eduScholarshipNo = new EduScholarshipNo();
			eduScholarshipNo.setEduscno(1001);
			eduScholarshipNo.setCollegeCode("SCH1001");
			eduScholarshipNo.setAadharNo("2345 6545 6789");
			EduScholarshipDao eduScholarshipDao = new EduScholarshipDao();
			EduScholarship eduScholarship = eduScholarshipDao.getEduScholarship(eduScholarshipNo);
			System.out.println(eduScholarship);
		} finally{
			EntityManagerFactoryRegistry.closeEntityManagerFactory();
		}

	}

}
