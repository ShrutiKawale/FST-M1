package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Set;

public class Activity11_4 {

        public static void main(String[] args) throws InterruptedException {
                FirefoxDriver driver = new FirefoxDriver();
                driver.get("https://www.training-support.net/selenium/tab-opener");
                System.out.println("the title of the first tab " +driver.getTitle());
                driver.findElement(By.id("launcher")).click();
                Set<String> windowHandles = driver.getWindowHandles();
                String handles="";
                for(String handle : windowHandles)
                {
                        System.out.println(handle);
                        handles=handle;
                }
                System.out.println(handles);

                driver.switchTo().window(handles);
                Thread.sleep(2000);
                System.out.println("The title of second window is"+driver.getTitle());
                driver.findElement(By.id("actionButton")).click();
                windowHandles = driver.getWindowHandles();
                for(String handle : windowHandles)
                {
                        System.out.println(handle);
                        handles=handle;
                }
                driver.switchTo().window(handles);
                System.out.println("The title of second window is"+driver.getTitle());
                driver.quit();



        }
}
