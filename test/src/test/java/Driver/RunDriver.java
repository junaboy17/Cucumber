package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RunDriver {
	WebDriver driver;
public WebDriver launchwith(String browser, String URL) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\junab\\Documents\\Drivers\\chromedriver.exe");

	
	if(browser.equals("Chrome")) {
		driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver.manage().window().maximize();
	}
	
	else if (browser.equals("mozilla")) {
		driver = new FirefoxDriver();	
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}
	
	else if (browser.equals("ie")) {
		driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}
	
	else {
		System.out.println("Not valid");
		
	}
	
	driver.get(URL);
	
	return driver;
	
}
	
	
	

}
