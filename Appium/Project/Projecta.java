package Activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Projecta {

    AndroidDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformaName","android");
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("deviceName","MyPixel");
        cap.setCapability("appPackage", "com.google.android.apps.tasks");
        cap.setCapability("appActivity", ".ui.TaskListsActivity");
        cap.setCapability("noRest", true);
        URL serverUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverUrl, cap);
    }
    @Test
    public void doTask(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("welcome_get_started")));
        driver.findElementById("welcome_get_started").click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Create new task\"]")));
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Create new task\"]").click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("add_task_title")));
        driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Tasks");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("add_task_done")));
        driver.findElementById("add_task_done").click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Create new task\"]")));
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Create new task\"]").click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("add_task_title")));
        driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Keep");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("add_task_done")));
        driver.findElementById("add_task_done").click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Create new task\"]")));
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Create new task\"]").click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("add_task_title")));
        driver.findElementById("add_task_title").sendKeys("Complete the second Activity Google Keep");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("add_task_done")));
        driver.findElementById("add_task_done").click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("task_data")));
        List<MobileElement> elementList = new ArrayList<>();
        elementList= driver.findElementsByXPath("//android.widget.FrameLayout[contains(@resource-id,'com.google.android.apps.tasks:id/task_item_layout')]");// resouser id -- com.google.android.apps.tasks:id/task_data
        Map<Integer,String> data = new HashMap<>();
        int i=1;
        for(MobileElement ele :elementList){
            String str = ele.getAttribute("content-desc");
            System.out.println(str);
            data.put(i,str);
            i++;

        }

        for(Integer key : data.keySet()){
            switch(key){
                case 1:
                    Assert.assertEquals(data.get(1),"Complete the second Activity Google Keep");
                    break;
                case 2:
                    Assert.assertEquals(data.get(2),"Complete Activity with Google Keep");
                    break;
                case 3:
                    Assert.assertEquals(data.get(3),"Complete Activity with Google Tasks");
                    break;
            }
        }

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
