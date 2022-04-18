package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeMethod
    public static void login( ITestResult result){
        driver=  new FirefoxDriver();

        wait=  new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String testngCurrentClassMethod = result.getMethod().getMethodName();
        driver.get("https://alchemy.hguy.co/crm/");
        //System.out.println(testngCurrentClassMethod+ "************");
        if(testngCurrentClassMethod.equals("activityOne") || testngCurrentClassMethod.equals("activityTwo") || testngCurrentClassMethod.equals("activityThree"))
        {
            //System.out.println("if is true ****************");
        }
        else{

            wait.until(ExpectedConditions.elementToBeClickable(By.id("user_name")));
            driver.findElement(By.id("user_name")).sendKeys("admin");
            driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
            driver.findElement(By.id("bigbutton")).click();

        }
    }
    @AfterMethod
    public static void tearDown(){
        //System.out.println(driver+"in tear down ***");
        driver.quit();
    }
}
