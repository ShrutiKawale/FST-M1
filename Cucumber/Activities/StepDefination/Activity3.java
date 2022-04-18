package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity3 extends BaseClass{

    org.openqa.selenium.Alert alert;

    @Given("^User is on the page$")
    public void openBrowser(){

        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }
    @When("^User clicks the Simple Alert button$")
    public void openAlert(){
        driver.findElement(By.cssSelector("#simple")).click();
    }
    @Then("^Alert opens$")
    public void switchFocus() {
        alert = driver.switchTo().alert();
    }
    @And("^Read the text from it and print it$")
    public void readAlert() {
        System.out.println("Alert says: " + alert.getText());
    }
    @And("^Close the alert$")
    public void closeAlert(){
        alert.accept();
    }


    @When("^User clicks the Confirm Alert button$")
    public void clickConfirmPrompt(){
        driver.findElement(By.cssSelector("#confirm")).click();
    }
    @And("^Close the alert with Cancel$")
    public void closeAlertWithCancel() {
        alert.dismiss();
    }

    @When("^User clicks the Prompt Alert button$")
    public void clickPromptAlert(){
        driver.findElement(By.cssSelector("#prompt")).click();
    }
    @When("^Write a custom message in it$")
    public void writeACustomMessageOnPrompt(){
        alert.sendKeys("Custom Message");

    }

}
