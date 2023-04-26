package com.bankingpro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest{
	
	bankingdao b1=new bankingdao();
	

//	@Test
// // positive test case
//	public void testlogin() throws Exception {
//		
//		b1.dbconnection();
//		int exp=124;
//		int res=b1.login("surya", 2505);//res is actual value from login	
//		assertEquals(exp,res);
//}
//	
//	@Test
////  negative test case
//	public void testlogin2() throws Exception {
//		
//		b1.dbconnection();
//		int exp=0;
//		int res=b1.login("sury", 2505);//res is actual value from login	
//		assertEquals(exp,res);
//		
//	}
//	
//	@Test
////  negative with wrong password
//	public void testlogin3() throws Exception {
//		
//		b1.dbconnection();
//		int exp=-1;
//		int res=b1.login("surya", 2501);//res is actual value from login	
//	assertEquals(exp,res);
//		
//	}
//	
////	@Test
////	public void testdeposit()throws Exception{
////		
////		b1.dbconnection();
////		
////		int exp=49000;
////		int availamount=b1.deposit(3000, 101);
////		assertEquals(exp,availamount);
////	}
////	
//	
////	@Test 
////	public void testwithdraw()throws Exception {
////		
////		b1.dbconnection();
////		
////		int exp=31000;
////		
////		int amt=b1.withdraw(4000, 2505, 101);
////		
////		assertEquals(exp,amt);
////	}
//	
//	@Test 
//	public void testwithdraw()throws Exception {
//		
//		b1.dbconnection();
//		
//		int exp=-1;
//		
//		int amt=b1.withdraw(40000, 2505, 101);
//		
//		assertEquals(exp,amt);
//	}
//	
//	
//	@Test
//	public void testpwd() throws Exception {
//		
//		int exp=1;
//		
//		b1.dbconnection();
//		int res=b1.changepwd(2505, 1213, 101);
//		assertEquals(exp,res);
//	}
//	
//	@Test
//	public void testdel() throws Exception {
//		b1.dbconnection();
//		
//		int exp=1;
//		int act=b1.deleteAccount(1213, 101);
//		assertEquals(exp,act);
//	}
	
	
	@Test
	public void testregister() throws Exception {
		
		
		customer c1=new customer();
		c1.cusid=101;
		c1.cusname="Bhaskara";
		c1.cuspin=2505;
		c1.cusamount=50000;
		
		
		int exp=1;
		b1.dbconnection();
		
		int act=b1.registercustomer(c1);
		assertEquals(exp,act);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}