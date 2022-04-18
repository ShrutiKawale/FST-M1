package Activities;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ActivityThree extends BaseClass{

    @Test
    public void activityThree(){
        String footer = driver.findElement(By.id("admin_options")).getText();
        System.out.println("This is the footer on the page form activity3"+footer);
    }
}
