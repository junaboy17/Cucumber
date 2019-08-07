package testrunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith( Cucumber.class) 

@CucumberOptions(
		//location of the feature file
		features = {},
		//Location of the step defination
		glue = {},
		//Which tags to runs test for 
		tags = {},
		//format such as pretty
		plugin = {"pretty","json:target/cucumber-resports.json", "html:target/cucumber-resports"}, monochrome = true)
		
		

public class CucumberTestRunner{
	
	
	
	
	
	
	
	
}
