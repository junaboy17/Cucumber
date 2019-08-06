package homePageTest;

import static org.junit.Assert.*;
import org.openqa.selenium.By;

import appFunctions.HomePageFunctions;
import appFunctions.RegistrationPageFunctions;
import driverFactory.DriverBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.myUtil;
import xPath.HomePageXPath;
import xPath.RegistrationPageXPath;



public class HomePageFeature extends DriverBase {

	HomePageFunctions home = new HomePageFunctions();
	RegistrationPageXPath xPath1 = new RegistrationPageXPath();

	HomePageXPath xPath = new HomePageXPath();
	myUtil util = new myUtil();
	RegistrationPageFunctions reg = new RegistrationPageFunctions();
	String User = "akm6";


	@Given("I open {string}")
	public void i_open(String browser){
		
		launcher(browser);
		//setup(browser);
		util.wait(3000);
	}

	@And("I browse to {string}")
	public void i_browse_to(String URL) {

	 driver.navigate().to(URL);
	}
	
	
	@Then("I should see {string}")
	public void i_should_see(String desiredText) {
		//assertEquals("FAILED : Profile Name not Matched!!!",home.validateSearch(desiredText),true);
		assertEquals("FAILED : Profile Name not Matched!!!", home.validateSearch(desiredText));
		assertEquals("FAILED : Profile Name not Matched!!!", home.validateSearch(desiredText),true);
		util.wait(3000);
		driver.close();
	}
	
	
	@When("I click logIn and signUp")
	public void i_click_logIn_and_signUp() {
		
		driver.findElement(By.xpath(xPath.logIn)).click();
		driver.findElement(By.xpath(xPath.signUp)).click();
	}


	@When("I enter all userInformation and click createAccount")
	public void i_enter_all_userInformation_and_click_createAccount() {
		driver.findElement(By.xpath(xPath1.email)).sendKeys(User + "@gmail.com");
		driver.findElement(By.xpath(xPath1.createUserName)).sendKeys(User);

		driver.findElement(By.xpath(xPath1.createPassword)).sendKeys("password");
		driver.findElement(By.xpath(xPath1.confirmPassword)).sendKeys("password");
		driver.findElement(By.xpath(xPath1.createFirstName)).sendKeys("Mr. ");
		driver.findElement(By.xpath(xPath1.createLastName)).sendKeys("AKM");
		driver.findElement(By.xpath(xPath1.createAddress)).sendKeys("1231 fith ave");
		driver.findElement(By.xpath(xPath1.createAccount)).click();
	
	
}
}
