package TestRunnerrrr;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utility.Base_Parent;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



	@CucumberOptions(features = {"src/test/resources/Feature_Files"},
			plugin = {"json:target/cucumber.json"},
			glue = "StepDefinition")//tags= {"@YY, @HH"})
	public class Testrunnerrr  extends AbstractTestNGCucumberTests{

	@BeforeTest
	public void metasetup() {
		Base_Parent test = new Base_Parent();
		test.metaBrowserinit();
	}
	
	@AfterTest
	public void metaCloseURL() {
		Base_Parent test = new Base_Parent();
		test.driver.quit();
		
	}
		
		
		
	
}
