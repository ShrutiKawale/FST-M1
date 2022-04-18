package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class Activity10_1 {

    public static void main(String[] agrs) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("title of the page is " + driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        String theCurrentDisplayNo = driver.findElement(By.xpath("//div[contains(@id,'D3Cube')]/div[@class='active']/h1")).getText();
        System.out.println("Number before any click on page " + theCurrentDisplayNo);
        Actions act = new Actions(driver);
        act.contextClick(driver.findElement(By.xpath("//div[contains(@id,'side')]"))).build().perform();
        Thread.sleep(3000);
        theCurrentDisplayNo = driver.findElement(By.xpath("//div[contains(@id,'D3Cube')]/div[@class='active']/h1")).getText();
        System.out.println("After the left click "+theCurrentDisplayNo);
        Thread.sleep(3000);
        act.click().build().perform();
        Thread.sleep(3000);
        theCurrentDisplayNo = driver.findElement(By.xpath("//div[contains(@id,'D3Cube')]/div[@class='active']/h1")).getText();
        System.out.println("After the right click "+theCurrentDisplayNo);

    }
}
