package com;

import org.testng.annotations.Test;

public class RegressionTest extends BaseTest {

	@Test(groups="Regression")
	public void test2() {
		System.out.println("Test2");
	}

	@Test(groups="Smoke")
	public void test3() {
		System.out.println("Test3");
	}

}
