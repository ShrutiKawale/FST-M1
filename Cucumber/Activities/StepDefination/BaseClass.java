package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseClass {
   public static WebDriver  driver = new FirefoxDriver();
    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


}
