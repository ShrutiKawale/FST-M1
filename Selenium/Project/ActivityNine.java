package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ActivityNine extends BaseClass{

    @Test
    public static void activityNine(){

        wait.until(ExpectedConditions.elementToBeClickable(By.id("grouptab_0")));
        driver.findElement(By.id("grouptab_0")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class='topnav'])[1]//a[@id='moduleTab_9_Leads']")));
        driver.findElement(By.xpath("(//li[@class='topnav'])[1]//a[@id='moduleTab_9_Leads']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@field='name']//a)[1]")));
        for(int i=1;i<=10;i++) {
            String name = driver.findElement(By.xpath("(//td[@field='name']//a)[" + i + "]")).getText();
            String userName = driver.findElement(By.xpath("(//td[@field='assigned_user_name']//a)["+i+"]")).getText();
            System.out.println(name + "  "+userName);
        }
    }
}
