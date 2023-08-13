package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;
	
	@Test
	public void test1() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test2() {
		driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
	}

}
