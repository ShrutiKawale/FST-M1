package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net");
        Thread.sleep(10000);
        System.out.println("Title of page is" + driver.getTitle());
        String buttonText= driver.findElement(By.xpath("//a[@id='about-link']")).getText();
        System.out.println("This is the text for button identified with xpath "+buttonText);
        driver.close();
    }
}
