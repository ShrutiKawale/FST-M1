package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        Thread.sleep(10000);
        System.out.println("Is give element is present the input text "+driver.findElement(By.xpath("//input[@name='toggled']")).isDisplayed());
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        System.out.println("Removed the input text");
        System.out.println("Is give element is present the input text  "+driver.findElement(By.xpath("//input[@name='toggled']")).isDisplayed());
        driver.close();

    }


}
