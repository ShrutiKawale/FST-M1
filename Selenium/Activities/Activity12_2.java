package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_2 {

    public static void main(String[] args){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/nested-iframes");
        driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']")));
        WebElement innerFrameOne = driver.findElement(By.xpath("//div[@class='content']"));
        System.out.println(innerFrameOne.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']")));
        WebElement innerFrameTwo = driver.findElement(By.xpath("//div[@class='content']"));
        System.out.println(innerFrameTwo.getText());

    }
}
