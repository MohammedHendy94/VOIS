package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features", glue = "Tests" , plugin = {"pretty" , "html:target/report/reports.html"} )

public class Runner {
}
