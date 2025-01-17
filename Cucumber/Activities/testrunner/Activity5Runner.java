package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/Feature",
        glue={"StepDefination"},
        tags = "@activity5",
        plugin = {"pretty"},
        monochrome = true
)

public class Activity5Runner {
}
