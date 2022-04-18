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


public class Projectb {


    AndroidDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformaName", "android");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("deviceName", "MyPixel");
        cap.setCapability("appPackage", "com.google.android.keep");
        cap.setCapability("appActivity", ".activities.BrowseActivity");
        cap.setCapability("noRest", true);
        URL serverUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverUrl, cap);
    }

    @Test
    public void doTask() {
        WebDriverWait wait = new WebDriverWait(driver,10);
       /* wait.until(ExpectedConditions.elementToBeClickable(By.id("welcome_get_started")));
        driver.findElementById("welcome_get_started").click();*/

        wait.until(ExpectedConditions.elementToBeClickable(By.id("new_note_button")));
        driver.findElementById("new_note_button").click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("editable_title")));
        driver.findElementById("editable_title").sendKeys("NoteOne");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("edit_note_text")));
        driver.findElementById("edit_note_text").sendKeys("writing into note1");
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("browse_text_note")));
        String str = driver.findElementById("browse_text_note").getAttribute("content-desc");
        System.out.println(str);
        Assert.assertEquals(str,"NoteOne. writing into note1. ");
    }
}

