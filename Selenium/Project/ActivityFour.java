package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActivityFour extends BaseClass{
    @Test
    public void activityFour() {

        wait.until(ExpectedConditions.elementToBeClickable(By.id("tab0")));
        String homeButtonText = driver.findElement(By.id("tab0")).getText();
        SoftAssert softassert = new SoftAssert();
        softassert.assertEquals(homeButtonText,"SUITECRM DASHBOARD","Home page is not loaded pls check.");
        softassert.assertAll();

    }
}
