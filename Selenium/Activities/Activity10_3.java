package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_3 {
            public static void main(String[] args){
                FirefoxDriver driver = new FirefoxDriver();
                driver.get("https://www.training-support.net/selenium/drag-drop");
                System.out.println(driver.getTitle());
                Actions act = new Actions(driver);
                WebElement source = driver.findElement(By.id("draggable"));
                WebElement dropZone1 = driver.findElement(By.id("droppable"));
                WebElement dropeZone2 = driver.findElement(By.id("dropzone2"));
                act.dragAndDrop(source,dropZone1).build().perform();
                System.out.println(dropZone1.getText());
                act.dragAndDrop(source,dropeZone2).build().perform();
                System.out.println(dropeZone2.getText());
                driver.quit();

            }
}
