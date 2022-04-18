package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/");
        Thread.sleep(10000);
       System.out.println("Title of page is" + driver.getTitle());
       System.out.println("With By.id() "+driver.findElement(By.id("about-link")).getText());
       //selenium-compound-class-names-not-permitted hence skipping it
       //System.out.println("With By.class() "+driver.findElement(By.className("ui inverted huge green button")).getText());
       System.out.println("With by.linkText "+ driver.findElement(By.linkText("About Us")).getText());
       System.out.println("With cssSelector "+driver.findElement(By.cssSelector("#about-link")).getText());
       driver.close();


    }
}
