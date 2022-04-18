package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {

    public static void main(String[] agrs){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        System.out.println("title of the page is "+ driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[starts-with(@class,'username')]")));
        driver.findElement(By.xpath("//input[starts-with(@class,'username')]")).sendKeys("Harry");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[starts-with(@class,'password')]")));
        driver.findElement(By.xpath("//input[starts-with(@class,'password')]")).sendKeys("Harry123");
        driver.findElement(By.xpath("//button[@onclick='signIn()']")).click();

    }
}
