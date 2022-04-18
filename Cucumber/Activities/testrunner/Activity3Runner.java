package testrunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/Feature/Activity3.feature",
        glue={"StepDefination"},
        tags = "@activity3"
)
public class Activity3Runner {
}
