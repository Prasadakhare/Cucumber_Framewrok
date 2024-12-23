package runner;

import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		
		features = "src//test//resources//features//TaskManagement.feature",
				glue = {"stepDeff"},
				tags="SmokeTest"

		)
public class TaggedRunner extends AbstractTestNGCucumberTests {

}

