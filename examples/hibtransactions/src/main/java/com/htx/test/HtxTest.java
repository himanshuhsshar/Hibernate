package com.htx.test;

import com.htx.dao.BranchDao;
import com.htx.entities.Branch;
import com.htx.helper.SessionFactoryRegistry;

public class HtxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Branch branch = null;
		BranchDao branchDao = null;
		try {
			branch = new Branch();
			branch.setBranchNo(1);
			branch.setBranchName("Ammerpeet Branch");
			branch.setIfscCode("HDFC00001");
			branch.setContactNo("8109465904");
			branch.setLocation("Hyderabad");
			branch.setWorkingHours("09:00 - 17:00");
			branchDao = new BranchDao();
			branchDao.saveBranch(branch);
		}
		finally{
			if(SessionFactoryRegistry.getSessionFactory()!=null) {
				SessionFactoryRegistry.closeSessionFactory();
			}
			
		}
	}

}
