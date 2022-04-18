package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

    public static void main(String[] args){
        FirefoxDriver driver = new FirefoxDriver();
        System.out.println(driver.getTitle());
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        driver.findElement(By.id("confirm")).click();
        Alert alert= driver.switchTo().alert();
        System.out.println("Message on alert "+alert.getText());
        alert.accept();
        driver.findElement(By.id("confirm")).click();
        alert.dismiss();
        driver.quit();

    }
}
