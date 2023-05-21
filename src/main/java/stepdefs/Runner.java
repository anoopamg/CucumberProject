package stepdefs;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		monochrome = true,
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
		features = "src/test/java/features", 
		glue = "stepdefs",
		//tags = {"@WIP"}, 
		tags = {"@Sanity"}
		//tags = {"@Regression or @Sanity"}, // runs test cases which have either Regression or Sanity tags
		//tags = {"@Regression and @Sanity"}, // runs test cases which have both Regression and Sanity tags
		//tags = {"@Calculator"}, //tags at feature file level
		//If we need browser only for some feature, then use @Browser for that feature then Hooks will run only for those
		//tags = {"not @WIP"}
		//tags = {"@Browser and not @WIP"}
		)

public class Runner {

}
