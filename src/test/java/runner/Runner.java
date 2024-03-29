package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "steps",
        tags = "@all",
        dryRun = false, //if true wont run steps just check for un-implemented steps
        plugin = {
                "html:target/html_report/report.html",
                "json:target/jsonReports/report.json"

        }
)
public class Runner {
}
