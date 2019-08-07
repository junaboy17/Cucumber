package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Driver.RunDriver;

public class Result extends RunDriver{
	
	
	public boolean nameResult(String supposedText, String locator) {
		
		WebElement name = driver.findElement(By.xpath(locator));
		String actualName = name.getText();
		String supposedName = supposedText;
		if(actualName.equalsIgnoreCase(supposedName)) {
			return true;
			
	}
		return false;
		
	}
}

