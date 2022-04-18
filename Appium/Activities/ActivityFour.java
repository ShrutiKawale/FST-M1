package Activities;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ActivityFour {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "android");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("deviceName", "MyPixel");
        cap.setCapability("appPackage", "com.google.android.dialer");
        cap.setCapability("appActivity", ".extensions.GoogleDialtactsActivity");
        cap.setCapability("noRest", true);
        //server URL
        URL serverUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverUrl, cap);
    }
    @Test
    public void addContact(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.findElementById("contacts_tab").click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("empty_list_view_action")));
        driver.findElementById("empty_list_view_action").click();
        //driver.findElementById("right_button").click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@text='First name']")));
        driver.findElementByXPath("//android.widget.EditText[@text='First name']").sendKeys("Harry");
        driver.findElementByXPath("//android.widget.EditText[@text='Last name']").sendKeys("Potter");
        driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("123456782");
       /* wait.until(ExpectedConditions.elementToBeClickable(By.id("editor_menu_save_button")));
        driver.findElementById("editor_menu_save_button").click();*/
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.LinearLayoutCompat/android.widget.Button")));
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.LinearLayoutCompat/android.widget.Button").click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.View[3]")));
        String contactName = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.View[3]").getText();
        System.out.println(contactName);

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
