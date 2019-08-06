package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driverFactory.DriverBase;

public class myUtil extends DriverBase {
	
	
	public boolean textValidation(String desiredText, String locators) {
		try {
		String dText = desiredText;
		String actual = driver.findElement(By.xpath(locators)).getText();
		if(dText.equalsIgnoreCase(actual)){
			System.out.println("Desired Text Matches Actual Text.  Test Passed");
			return true;
		}
		else{
			System.out.println("Text Does Not Match.  Test Failed");
			return false;
		}
	}
		catch (Exception e) {
			return false;			
		}
		
	}
		
	
	
		public boolean textNotValidate(String desiredText, String locators) {
			
			try {
				String dText = desiredText;
				String actual = driver.findElement(By.xpath(locators)).getText();
				if(dText.equalsIgnoreCase(actual)){
					System.out.println("Desired Text Does Not Matche Actual Text.  Test Passed");
					return false;
				}
				else{
					System.out.println("Text Matches.  Test Failed");
					return true;
				}
			}
			catch (Exception e) {
				return false;			
			}
			
		}
		
		
		
		public void wait(int miliseconds) {
			try {
				Thread.sleep(miliseconds);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		public void Close() {
			driver.close();
			
		}
	
	
	
	
	
	
	
}
