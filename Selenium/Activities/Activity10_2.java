package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Activity10_2 {

    public static void main(String[] agrs) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("title of the page is " + driver.getTitle());
        Actions act = new Actions(driver);
        act.sendKeys("s").build().perform();
        act.keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build().perform();

        String typedKey = driver.findElement(By.id("keyPressed")).getText();
        System.out.println("Pressed key is: " + typedKey);


    }
}
