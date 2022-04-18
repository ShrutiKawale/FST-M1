package Activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ActivitySix {

    AndroidDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformaName","android");
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("deviceName","MyPixel");
        cap.setCapability("appPackage", "com.android.chrome");
        cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        cap.setCapability("noRest", true);
        URL serverUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverUrl, cap);
    }
    @Test
    public void browse() {
        driver.get("https://www.training-support.net/selenium/lazy-loading");
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("terms_accept")));
        driver.findElementById("terms_accept").click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("negative_button")));
        driver.findElementById("negative_button").click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]")));
        List<MobileElement> numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
        System.out.println("Number of image shown currently: " + numberOfImages.size());
        wait.until(ExpectedConditions.elementToBeClickable(By.id("infobar_close_button")));
        driver.findElementById("infobar_close_button").click();


        driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollTextIntoView(\"helen\")"));

        // Find the number of images shown after scrolling
        numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
        System.out.println("Number of image shown currently: " + numberOfImages.size());

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
