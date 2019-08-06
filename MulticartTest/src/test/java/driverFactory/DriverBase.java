package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverBase {
	
	public WebDriver driver;
	
	public static final String USERNAME = "pntuser";

	public static final String ACCESS_KEY = "fbc2e74f-f8c6-4d7d-ac89-66cb1b984af2";

	public static final String URL = "https://"+ USERNAME + ":" + ACCESS_KEY  + "@ondemand.com443/wd/hub";

	

	//@BeforeClass

	//@Parameters({"browser","version","platform"})

/*	public void setup(String browser) throws MalformedURLException{

		

		

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(CapabilityType.BROWSER_NAME, browser);

		capabilities.setCapability(CapabilityType.VERSION,"75");

		capabilities.setCapability(CapabilityType.PLATFORM_NAME,"Windows 7");

		driver = new RemoteWebDriver(new URL(URL),capabilities);*/

public WebDriver launcher(String browserType) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\junab\\Documents\\Drivers\\chromedriver.exe");
	
	
	
		// Create the Driver 
		if (browserType.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
			driver.navigate().to("http://www.google.com");
			driver.manage().window().maximize();
			
		} else if(browserType.equalsIgnoreCase("mozilla")) {
			driver = new FirefoxDriver();
			driver.navigate().to("http://www.google.com");
			driver.manage().window().maximize();
			
		} else if(browserType.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
			driver.navigate().to("http://www.google.com");
			driver.manage().window().maximize();
		}
		else {
			System.out.println("Not A valid Driver !!!!");
		}
		
		// go to the application
		
		return driver;
		
	}
	



	
}

