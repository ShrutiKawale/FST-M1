package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ActivitySeven extends BaseClass {

    @Test
    public void activityseven(){
        wait.until(ExpectedConditions.elementToBeClickable(By.id("grouptab_0")));
        driver.findElement(By.id("grouptab_0")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class='topnav'])[1]//a[@id='moduleTab_9_Leads']")));
        driver.findElement(By.xpath("(//li[@class='topnav'])[1]//a[@id='moduleTab_9_Leads']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[1]//span[@title='Additional Details']")));
        driver.findElement(By.xpath("//tr[1]//span[@title='Additional Details']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@title='Close'])[4]")));
        String phoneNumber = driver.findElement(By.xpath("//div[contains(@id,'ui-id')]/span")).getText();
        System.out.println("the phone number in details is :: "+ phoneNumber);
        driver.findElement(By.xpath("(//button[@title='Close'])[4]")).click();



    }
}
