package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity12_3 {
    public static void main(String[] args){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/popups");
        System.out.println("Title of the page is "+driver.getTitle());
        Actions act = new Actions(driver);
        WebElement button = driver.findElement(By.xpath("//button[@onclick='openModal()']"));
        act.moveToElement(button).build().perform();
        System.out.println(button.getAttribute("data-tooltip"));
        button.click();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@onclick='signIn()']")).click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(message);
        driver.close();
    }
}
