package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_1 {

    public static void main(String[] args){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/iframes");
        System.out.println("The title of the page is "+driver.getTitle());
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//button[contains(@class,'red')]")).click();
        WebElement frame1Button = driver.findElement(By.xpath("//button[@id='actionButton']"));
        System.out.println(frame1Button.getText());
        System.out.println(frame1Button.getCssValue("background-color"));

        driver.switchTo().defaultContent();
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("window.scrollBy(0,500)");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']")));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='actionButton']")));

        driver.findElement(By.xpath("//button[@id='actionButton']")).click();
        WebElement frame2Button = driver.findElement(By.xpath("//button[@id='actionButton']"));
        System.out.println(frame2Button.getText());
        System.out.println(frame2Button.getCssValue("background-color"));


    }
}
