package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        Thread.sleep(10000);
        System.out.println("Input field status is enabled "+driver.findElement(By.xpath("//input[@id='input-text']")).isEnabled());
        driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
        System.out.println("Status after the enabling the field");
        System.out.println("Input field status is enabled "+driver.findElement(By.xpath("//input[@id='input-text']")).isEnabled());
        driver.close();
    }


}
