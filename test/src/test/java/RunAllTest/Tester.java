package RunAllTest;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Driver.RunDriver;
import XPath.XPathV;
import test.Process2;

public class Tester extends RunDriver{
	
	Process2 myTest;
	XPathV xPath = new XPathV();
	
	
	@BeforeMethod
	public void startingPoint() {
		myTest = new Process2();
		myTest.entry();
		
	}
	

	@AfterMethod
	public void quitBrowser() {
		
		myTest.browserClose();
	
	}
	
	
	@Test
	public void logInCorrectly() {
		
		myTest.login("user", "pass");
		assertEquals(myTest.checkProName("James Williams", xPath.nameCheck ),true, "Name do not mathch");
	}

	
	
}
