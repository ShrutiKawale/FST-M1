package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 extends BaseClass{

    @Given("^User is present on login page$")
    public void openLoginPage(){

        driver.get("https://www.training-support.net/selenium/login-form");
    }
   @When("^User enters the credentials$")
    public void enterCredentials(){
       driver.findElement(By.id("username")).sendKeys("admin");
       driver.findElement(By.id("password")).sendKeys("password");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
   }

   @Then("^Read the page title and confirmation message$")
   public void readTitleAndMessage(){
    String pageTitle = driver.getTitle();
   String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();
   System.out.println("Page title is: " + pageTitle);
   System.out.println("Login message is: " + confirmMessage);
   }


}
