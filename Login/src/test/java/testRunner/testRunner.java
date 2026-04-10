package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="C://Users//Dell//IdeaProjects//Login//Features//Login.feature",
        glue="stepDef"
)

public class testRunner {
}
