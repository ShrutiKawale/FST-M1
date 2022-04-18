package Activities;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {

    public static void main(String[] agrs){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/selects");
        System.out.println("title of the page is " + driver.getTitle());

        WebElement ele = driver.findElement(By.xpath("//select[@id='single-select']"));
        ele.click();

        Select sel = new Select(ele);
        System.out.println("Is this mulit-select type "+sel.isMultiple());
        sel.selectByIndex(2);

        ele.click();
        sel.selectByValue("4");

        ele.click();
        sel.selectByVisibleText("Option 5");

        List<WebElement> options = driver.findElements(By.xpath("//select[@id='single-select']/option"));
        for(WebElement element : options){
            System.out.println(element.getText());
        }



    }
}
