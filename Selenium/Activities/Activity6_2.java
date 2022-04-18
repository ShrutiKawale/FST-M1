package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
        public static void main(String[] args){

                WebDriver driver = new FirefoxDriver();
                driver.get("https://training-support.net/selenium/ajax");
                System.out.println("title of the page is "+ driver.getTitle());
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick='loadText()']")));
                driver.findElement(By.xpath("//button[@onclick='loadText()']")).click();
                wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='ajax-content']/h1"),"HELLO!"));
                System.out.println("getting text after loading it " +driver.findElement(By.xpath("//div[@id='ajax-content']/h1")).getText());

                wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='ajax-content']/h3"),"I'm late!"));
                System.out.println("getting text after loading it " +driver.findElement(By.xpath("//div[@id='ajax-content']/h3")).getText());
                driver.close();

        }
}
