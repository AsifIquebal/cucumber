package cukeTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/automationPractice.feature",
        glue = "stepDef",
        //dryRun = true,
        plugin =
                {"pretty"
                        , "json:target/cucumber-report"
                        , "junit:target/cucumber-report"
                        , "html:target/cucumber-report"
                },
        tags = "@web"/*,
        stepNotifications = true*/
)
public class AutomationPractice_CukeTest {
}
