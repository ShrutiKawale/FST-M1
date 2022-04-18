package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        System.out.println("Checked the check box button");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@name='toggled']")));
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='toggled']")));
        driver.findElement(By.xpath("//input[@name='toggled']")).click();
        driver.close();
    }
}
