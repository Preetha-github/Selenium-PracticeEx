package runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
features="FeatureFiles/TagHook.feature",
glue= {"stepDefinitions","hooks"},
dryRun = false,
strict = false,
monochrome = true
//format= {"html: Report/HRM_LoginReport", "json: Report/HRM_LoginReport.json"},
//tags= {"@Before, @After"}
//tags = {"@Hooks"}

)
public class RunnerClass {

	
}
