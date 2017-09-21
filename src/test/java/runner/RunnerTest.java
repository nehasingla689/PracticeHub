package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/PVTRegression.json",
                "html:target/html"
        },
        glue = "definition",
        features = "classpath:feature",
        tags = "@facebook"

)
public class RunnerTest {
}
