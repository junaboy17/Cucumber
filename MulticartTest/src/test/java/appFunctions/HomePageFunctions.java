package appFunctions;

import org.openqa.selenium.By;

import driverFactory.DriverBase;
import util.myUtil;
import xPath.HomePageXPath;

public class HomePageFunctions extends DriverBase {

myUtil util = new myUtil();	
HomePageXPath xPath = new HomePageXPath(); 

	
public void validateSearch(String desiredText) {
	util.textValidation(desiredText, xPath.searchTextBox);
}
	
public void validateUser(String desiredText) {
	util.textValidation(desiredText, xPath.userName);
}

public void clickLogIn() {
	driver.findElement(By.xpath(xPath.logIn)).click();
}

public void clickSignUp() {
	driver.findElement(By.xpath(xPath.signUp)).click();
}




}
