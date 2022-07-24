package com.jpaannon.test;

import java.util.Date;

import com.jpaannon.dao.MobileBillDao;
import com.jpaannon.entities.MobileBill;

public class JPAAnnonTest {
	public static void main(String[] args) {
		MobileBillDao mobileDao = new MobileBillDao();
		MobileBill mobileBill = new MobileBill();
		
		mobileBill.setBillNo(1);
		mobileBill.setSubscriberName("Kerry");
		mobileBill.setSubscriptionType("Postpaid");
		mobileBill.setMobileNo("8109465904");
		mobileBill.setBillDate(new Date());
		mobileBill.setDueDate(new Date());
		mobileBill.setBillAmount(1001);
		
		mobileDao.saveMobileBill(mobileBill);
		
	}
}
