package Activities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class ActivityOne extends BaseClass{

    @Test()
    public static void activityOne(){

        String title = driver.getTitle();
        SoftAssert softassert = new SoftAssert();
        softassert.assertEquals("SuiteCRM",title,"The expected title is SuiteCRM hence test failed");
        softassert.assertAll();



    }
}
