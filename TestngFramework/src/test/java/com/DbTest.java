package com;

import org.testng.annotations.Test;

import db.DataDriven;

public class DbTest {
	
	@Test (dataProviderClass = DataDriven.class, dataProvider = "login")
	public void f(Integer n, String s) {
		System.out.println(n);
		System.out.println(s);
	}
	
	
}
