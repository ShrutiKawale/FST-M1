package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {

    public static void main(String[] args){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");

        WebElement chosen = driver.findElement(By.id("multi-value"));
        Select ele = new Select(driver.findElement(By.id("multi-select")));

        if(ele.isMultiple()) {

            ele.selectByVisibleText("Javascript");
            System.out.println(chosen.getText());
            ele.selectByValue("node");
            System.out.println(chosen.getText());
            for(int i=4; i<=6; i++) {
                ele.selectByIndex(i);
            }
            System.out.println("text "+ chosen.getText());
            ele.deselectByValue("node");
            System.out.println(chosen.getText());


            ele.deselectByIndex(7);
            System.out.println(chosen.getText());

            List<WebElement> selectedOptions = ele.getAllSelectedOptions();

            for(WebElement option : selectedOptions) {
                System.out.println("Selected option: " + option.getText());
            }

            //Deselect all options
            ele.deselectAll();
            System.out.println(chosen.getText());
        }
        //Close browser
        //driver.close();

    }
}
