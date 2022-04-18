package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ActivityFive extends BaseClass{

    @Test
    public void activity5(){
       wait.until(ExpectedConditions.elementToBeClickable(By.id("tab0")));
       String tabColor = driver.findElement(By.id("toolbar")).getCssValue("color");
       System.out.println("This is the tab color on home page "+ tabColor);
    }
}
