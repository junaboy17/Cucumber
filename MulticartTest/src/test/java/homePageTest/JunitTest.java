package homePageTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith( Cucumber.class) 

@CucumberOptions(
		//location of the feature file
		features = {"src/test/resource"},
		//Location of the step defination
		glue = {"homePageTest"},
		//Which tags to runs test for 
		tags = {"~@ignore"},
		//format such as pretty
		plugin = {"pretty","json:target/cucumber-resports.json", "html:target/cucumber-resports"}, monochrome = true)





public class JunitTest {

}
