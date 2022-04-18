package Activities;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.beans.Visibility;
import java.net.MalformedURLException;
import java.net.URL;

public class ActivityFive {

    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "android");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("deviceName", "MyPixel");
        cap.setCapability("appPackage", "com.google.android.apps.messaging");
        cap.setCapability("appActivity", ".ui.ConversationListActivity");
        cap.setCapability("noRest", true);
        //server URL
        URL serverUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverUrl, cap);
    }
    @Test
    public void sendMessage(){

    WebDriverWait wait = new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.FrameLayout")));
    //driver.findElementByClassName("android.widget.FrameLayout").click();
    driver.findElementByClassName("android.widget.LinearLayout").click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("compose_message_text")));
    driver.findElementById("compose_message_text").sendKeys("Hello form appium");
    driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Send SMS\"]/android.widget.LinearLayout").click();

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message_status")));
    String status = driver.findElementById("message_status").getText();
    Assert.assertEquals(status,"Now.SMS");

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
