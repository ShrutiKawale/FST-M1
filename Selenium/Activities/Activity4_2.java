package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Amey");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Miller");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amey@gmail.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("1234567834");
        driver.findElement(By.xpath("//input[@onclick='simpleFormSubmit()']")).click();
        driver.close();
    }
}
