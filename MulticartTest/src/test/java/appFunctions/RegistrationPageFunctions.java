package appFunctions;

import org.openqa.selenium.By;

import driverFactory.DriverBase;
import xPath.RegistrationPageXPath;

public class RegistrationPageFunctions extends DriverBase {

	RegistrationPageXPath xPath = new RegistrationPageXPath();
	
public void inputEmail(String email) {
	driver.findElement(By.xpath(xPath.email)).sendKeys(email);
}

public void inputUserName(String userName) {
	driver.findElement(By.xpath(xPath.createUserName)).sendKeys(userName);
}

public void inputPassword(String password) {
	driver.findElement(By.xpath(xPath.createPassword)).sendKeys(password);
}

public void inputConfirmPass(String conPass) {
	driver.findElement(By.xpath(xPath.confirmPassword)).sendKeys(conPass);
}

public void inputFirstName(String firstName) {
	driver.findElement(By.xpath(xPath.createFirstName)).sendKeys(firstName);
}

public void inputLastName(String lastName) {
	driver.findElement(By.xpath(xPath.createLastName)).sendKeys(lastName);
}

public void inputAddress(String address) {
	driver.findElement(By.xpath(xPath.createAddress)).sendKeys(address);
}

public void clickCreatAccount() {
	driver.findElement(By.xpath(xPath.createAccount)).click();

}
	
}
