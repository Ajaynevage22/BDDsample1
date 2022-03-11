package runners;




import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "@target/failed_scenario.txt",// when we are executing failed senario which we got from rerun
		//"src//test//resources//feature//GoogleSearch.feature",
		glue = {"stepDefs"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"
				//"rerun:target/failed_scenario.txt"
				
//				"html:target/reports/HtmlReport.html",
//				"json:target/reports/JsonReport.json",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		)
public class GooglePageRunner {

	
	

}
