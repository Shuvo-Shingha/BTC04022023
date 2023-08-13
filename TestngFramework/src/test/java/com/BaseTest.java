package com;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {

	@BeforeMethod(groups="Smoke")
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult r) {
		
		switch (r.getStatus()) {
		case ITestResult.SUCCESS:
			System.out.println(r.getName()+"is passed");
		case ITestResult.FAILURE:
			System.out.println(r.getName()+"is failed");
			System.out.println("took screenshot");
		}

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}

}
