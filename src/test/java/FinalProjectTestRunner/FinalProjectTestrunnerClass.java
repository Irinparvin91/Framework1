package FinalProjectTestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import FinalUtility.FinalBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/FinalFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "FinalProjectStepDeffination",tags = {"@Cartpage"})

public class FinalProjectTestrunnerClass extends AbstractTestNGCucumberTests {
	
@BeforeTest
public void FinalProjectOpenURL() {
FinalBase test =new FinalBase();
test.FinalProjectBrowser();
}
@AfterTest
public void FinalProjectcloseURL() {
	FinalBase test =new FinalBase();
	test.driver.quit();
}
}