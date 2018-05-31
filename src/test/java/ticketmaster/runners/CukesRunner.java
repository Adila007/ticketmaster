package ticketmaster.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



	@CucumberOptions(
			plugin = {"pretty",
					"html:target/cucumber-report",
					"json:target/cucumber.json"
			},
			tags = "@Login",
			features= "src/test/resources/ticketmaster.features/",
			glue="ticketmaster.step_definitions",
			dryRun=false 
	)
	public class CukesRunner extends AbstractTestNGCucumberTests {
		
	}
