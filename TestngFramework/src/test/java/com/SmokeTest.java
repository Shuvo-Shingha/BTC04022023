package com;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SmokeTest extends BaseTest {
	
	//@Test(groups="smoke")
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void assertTest() {
		SoftAssert s = new SoftAssert();
		s.assertTrue(3<5);
		System.out.println("Hi");
		s.assertFalse(3>9);
		System.out.println("Hello");
		s.assertAll();
	}

}
