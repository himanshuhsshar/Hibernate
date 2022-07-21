package com.hb3bs.test;

import com.hb3bs.dao.PolicyDao;
import com.hb3bs.entities.Policy;
import com.hb3bs.helper.ProgrammaticSessionFactoryRegistry;
import com.hb3bs.helper.PropsSessionFactoryRegistry;
import com.hb3bs.helper.XmlSessionFactoryRegistry;

public class HB3BStest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			PolicyDao policyDao = new PolicyDao();
			Policy policy = policyDao.getPolicy(1);
			System.out.println(policy);
		}/*finally {
			if(PropsSessionFactoryRegistry.getSessionFactory()!=null) {
				PropsSessionFactoryRegistry.closeSessionFactory();               // properties approach
			}
		}*/
		/*finally {
			if(XmlSessionFactoryRegistry.getSessionFactory()!=null) {
				XmlSessionFactoryRegistry.closeSessionFactory();                 // xml-based configuration approach
			}
		}*/
		finally {
			if(ProgrammaticSessionFactoryRegistry.getSessionFactory()!=null) {
				ProgrammaticSessionFactoryRegistry.closeSessionFactory();                 // programmatic approach
			}
		}

	}

}
