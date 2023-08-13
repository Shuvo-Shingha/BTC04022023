package db;

import org.testng.annotations.DataProvider;

public class DataDriven {
	
	@DataProvider(name="login")
	public Object[][] dp() {
		
		
		
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

}
