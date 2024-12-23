package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		
		features = "src//test//resources//features//UserLogin.feature",
				glue = {"stepDeff"},
				plugin = {"pretty", "html:target/cucumber-reports",
					"json:target/cucumber.json", "junit:target/cucumber.xml"}
		

		)
public class GooglePageRunner extends AbstractTestNGCucumberTests {

}
