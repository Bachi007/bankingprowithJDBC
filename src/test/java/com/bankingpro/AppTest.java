package com.bankingpro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest{
	
	bankingdao b1=new bankingdao();
	
//	
//	@Test
//	//positive test case
//	public void testlogin() throws Exception {
//		
//		b1.dbconnection();
//		int exp=124;
//		int res=b1.login("surya", 2505);//res is actual value from login	
//		assertEquals(exp,res);
//		
//	}
//	
//	@Test
//	//negative test case
//	public void testlogin2() throws Exception {
//		
//		b1.dbconnection();
//		int exp=124;
//		int res=b1.login("sury", 2505);//res is actual value from login	
//		assertEquals(exp,res);
//		
//	}
//	
//	@Test
//	//negative with wrong password
//	public void testlogin3() throws Exception {
//		
//		b1.dbconnection();
//		int exp=124;
//		int res=b1.login("surya", 2501);//res is actual value from login	
//		assertEquals(exp,res);
//		
//	}
	
	@Test
	public void testdeposit()throws Exception{
		
		b1.dbconnection();
		
		int exp=49000;
		int availamount=b1.deposit(3000, 101);
		assertEquals(exp,availamount);
	}
	
	
	
	
	
	
	
}