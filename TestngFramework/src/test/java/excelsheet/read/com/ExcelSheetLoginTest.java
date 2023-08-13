package excelsheet.read.com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import dbexcelsheetread.ReadXL;

public class ExcelSheetLoginTest {
	WebDriver driver;
	
	@Test(dataProviderClass =  ReadXL.class, dataProvider="login")
	public void test1() {
		
	}
	

}
