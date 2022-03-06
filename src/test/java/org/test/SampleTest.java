package org.test;

import org.testng.annotations.Test;

//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(priority=-4)
	private void tco() {
		System.out.println("<method1>");
			}
	@Test(priority=-2)
	private void tco1() {
		System.out.println("<method2>");
			}
	@Test(priority=3)
	private void tco2() {
		System.out.println("<method3>");
			}
	@Test(priority=-10,enabled=false)
	private void tco3() {
		System.out.println("<method4>");
			}
	@Test(invocationCount=10)
	private void tco4() {
		System.out.println("<method5>");
			}
	
	





}
//	
	
	
	
	
	
	
	
	
	
	
	
	
//	@BeforeClass
//	private void beforeClass() {
//		System.out.println("BeforeClass");
//	}
//	@BeforeMethod
//	private void beforeMethod() {
//		System.out.println("BeforMethod");
//	}
//	@AfterMethod
//	private void AfterMehod() {
//		System.out.println("AfterMethod");
//	}
//	@AfterClass
//	private void AfterClass() {
//		System.out.println("AfterClass");
//	}
//	
//	@Test
//	private void tc0() {
//	System.out.println("Method1");	
//	}
//	
//	@Test
//	private void tc01() {
//	System.out.println("Method2");	
//	}
//	@Test
//	private void tc02() {
//	System.out.println("Method3");	
//	}

	
	
	
	
	
	
	
	
	
	
//}
