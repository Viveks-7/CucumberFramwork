package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
				features = ".//feature/Customers.feature",
				glue = "StepDefinition",
				dryRun = false,
				monochrome = true,
//				tags="@regression1",  //scenario under sanity tags will execute only
				plugin = {"pretty","html:ReportsC/cucumber-reports/reports1.html"}
		)

public class Run 
{	

}
