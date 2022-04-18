package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@name='toggled']")).click();
        System.out.println("Checked the check box");
        System.out.println("is checked "+ driver.findElement(By.xpath("//input[@name='toggled']")).isSelected());

    }
}
