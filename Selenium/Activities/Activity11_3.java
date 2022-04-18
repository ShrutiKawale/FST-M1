package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

    public static void main(String[] args)  {
        FirefoxDriver driver = new FirefoxDriver();
        System.out.println(driver.getTitle());
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        driver.findElement(By.id("prompt")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Yes you are!! ");

        alert.accept();
        driver.quit();
    }
}
