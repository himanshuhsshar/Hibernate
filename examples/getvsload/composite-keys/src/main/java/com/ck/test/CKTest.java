package com.ck.test;

import com.ck.dao.LoanApplicationDao;
import com.ck.entities.LoanApplication;
import com.ck.entities.LoanApplicationNo;
import com.ck.helper.SessionFactoryRegistry;

public class CKTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			/*
			 * LoanApplication pk = new LoanApplication(); pk.setApplicationNo(10001);
			 * pk.setBranchCode("SBIN001");
			 */
			LoanApplicationNo loanApplicationNo = new LoanApplicationNo();
			loanApplicationNo.setApplicationNo(10001);
			loanApplicationNo.setBranchCode("SBIN001");
			LoanApplicationDao LoanApplicationDao = new LoanApplicationDao();
			//LoanApplication loanApplication = LoanApplicationDao.getLoanApplication(pk);
			LoanApplication loanApplication=LoanApplicationDao.getLoanApplication(loanApplicationNo);
			System.out.println(loanApplication);
			
		} finally{
			if(SessionFactoryRegistry.getSessionFactory()!=null) {
				SessionFactoryRegistry.closeSessionFactory();
			}
		}

	}

}
