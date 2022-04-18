package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ActivitySix extends BaseClass{

    @Test
    public void activitySix(){
        wait.until(ExpectedConditions.elementToBeClickable(By.id("tab0")));
        List<WebElement> elements = driver.findElements(By.className("topnav"));
        List<String> toolOptions = new ArrayList<>();
        for(int i=0 ;i< elements.size();i++){

            String str = driver.findElement(By.xpath("//a[@id='grouptab_"+i+"']")).getText();
            toolOptions.add(str);

        }
        if(toolOptions.contains("ACTIVITIES")){
            System.out.println("Test passed Activities option is present");
        }
        else{
            Assert.fail("The option Activities is NOT present");
        }

    }
}
