package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity1 extends BaseClass{

  @Given("^A user is on google home page$")
  public void openHomePage(){

      driver.get("https://www.google.co.in/");
        }
        @When("^User types in cheese and hits enter$")
        public void typesInKeyword(){
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Cheese");
        driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
        }
        @Then("^Count in number of search results shown$")
        public void countSearchResults(){
        String searchResults = driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
        System.out.println("Number if search results are "+ searchResults);
        }




}
