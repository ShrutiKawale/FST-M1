package Activities;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ActivityTwo extends BaseClass{

    @Test()
    public void activityTwo(){

       String header =  driver.findElement(By.xpath("//img[@alt='SuiteCRM']")).getAttribute("src");
       System.out.println("The header is " +header);
    }

}
