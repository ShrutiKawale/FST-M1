package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ActivityEight extends BaseClass{

        @Test
        public void activityEight() {
            wait.until(ExpectedConditions.elementToBeClickable(By.id("grouptab_0")));
            driver.findElement(By.id("grouptab_0")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class='topnav'])[1]//a[@id='moduleTab_9_Accounts']")));
            driver.findElement(By.xpath("(//li[@class='topnav'])[1]//a[@id='moduleTab_9_Accounts']")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class=' inlineEdit'])[1]")));
            for(int i=1 ;i<10; i=i+2){
                System.out.println(driver.findElement(By.xpath("(//td[@class=' inlineEdit'])["+i+"]")).getText());
            }


        }
        }
