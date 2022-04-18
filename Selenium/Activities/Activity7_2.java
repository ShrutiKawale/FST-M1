package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_2 {

    public static void main(String[] agrs) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        System.out.println("title of the page is " + driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String username="Harry";
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@class,'-username')]")));
        driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys(username);
        driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("Harry123");
        driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("Harry123");
        driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input")).sendKeys("Harry@xyz.com");
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='action-confirmation']"),"Thank you for registering, "+username));
        System.out.println(driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText());
        driver.quit();
    }


}