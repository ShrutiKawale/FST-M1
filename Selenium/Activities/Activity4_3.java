package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        Thread.sleep(10000);
        System.out.println("Title of page is" + driver.getTitle());
        System.out.println("Third header is "+ driver.findElement(By.xpath("//h3[@id='third-header']")).getText());
        System.out.println("The color for fifth element is"+ driver.findElement(By.xpath("//h5")).getCssValue("color"));
        System.out.println("The class name is "+driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class"));
        System.out.println("The Purple button using absolute xpath "+driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[4]")).getText());
        driver.close();
    }

}
