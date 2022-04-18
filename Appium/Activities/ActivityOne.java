package Activities;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ActivityOne {

    AndroidDriver driver;
    //will open calcualtor
    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "android");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("deviceName", "MyPixel");
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", ".Calculator");
        cap.setCapability("noRest", true);
        //server URL
        URL serverUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(serverUrl, cap);
    }
    @Test
    public void multiplyTest(){
        driver.findElementById("digit_5").click();
        driver.findElementById("op_mul").click();
        driver.findElementById("digit_8").click();
        driver.findElementByAccessibilityId("equals").click();
        int result = Integer.parseInt(driver.findElementById("result").getText());
        Assert.assertEquals(result,40);

        }
        @AfterClass
        public void tearDown(){
            driver.quit();
        }


    }


