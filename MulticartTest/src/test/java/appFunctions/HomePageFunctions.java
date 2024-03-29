package appFunctions;

import org.openqa.selenium.By;
import static org.junit.Assert.*;

import driverFactory.DriverBase;
import util.myUtil;
import xPath.HomePageXPath;

public class HomePageFunctions extends DriverBase {

myUtil util = new myUtil();	
HomePageXPath xPath = new HomePageXPath(); 

	
public void validateSearch(String desiredText) {
	//util.textValidation(desiredText, xPath.searchTextBox);
	assertEquals("Test failed",util.textValidation(desiredText, xPath.searchTextBox),false);

}
	
public void validateUser(String desiredText) {
	//util.textValidation(desiredText, xPath.userName);
	assertEquals("Test failed", util.textValidation(desiredText, xPath.userName),false);

}

public void clickLogIn() {
	driver.findElement(By.xpath(xPath.logIn)).click();
}

public void clickSignUp() {
	driver.findElement(By.xpath(xPath.signUp)).click();
}




}
