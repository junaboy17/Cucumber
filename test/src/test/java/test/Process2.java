package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Driver.RunDriver;
import XPath.XPathV;



public class Process2 extends RunDriver{
	XPathV xPath = new XPathV();
	Result nResult = new Result();	
	//RunDriver driver = new RunDriver();
	
	public void entry() {
		String website ="https://www.demo.iscripts.com/multicart/demo/index.php";
		launchwith("Chrome", website);
		driver.get(website);
		waitTime(3000);
		
	}
	
	public void login(String userName, String password) {
		WebElement login =(WebElement) driver.findElements(By.xpath(xPath.logIn));
		login.click();
		//chrome.findElementByXPath(xPath.userName).sendKeys(userName);
		//chrome.findElementByXPath(xPath.password).sendKeys(password);
		//chrome.findElementById(xPath.clickLogiIn).click();
		waitTime(3000);
	}
	
	public boolean checkProName(String proName, String locator) {
		return  nResult.nameResult(proName, locator);
	}
	
	
	
	
	public void browserClose() {
		driver.close();
		
	}
	
	
	
	
	
	
	public void waitTime(int timems) {
		try {
			Thread.sleep(timems);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
