package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Activity8_1 {

    public static void main(String[] agrs) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        System.out.println("title of the page is " + driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> list  =new ArrayList<WebElement>();
        list = driver.findElements(By.xpath("//table[contains(@class,'ui celled')]/tbody//following-sibling::tr"));
        System.out.println("Number of rows present are "+list.size());
        int sum=0;
        List<WebElement> listTwo = new ArrayList<WebElement>();
        for(int i=1;i<= list.size();i++){
            listTwo = driver.findElements(By.xpath("(//table[contains(@class,'ui celled')]/tbody//following-sibling::tr)["+i+"]//following-sibling::td"));
            //System.out.println(listTwo.size()+" for the value "+i);
            sum=sum+listTwo.size();
        }
        System.out.println("Total numbers columns present is "+sum);

        //Find and print the all the cell values of the third row of the table.
        listTwo = driver.findElements(By.xpath("(//table[contains(@class,'ui celled')]/tbody//following-sibling::tr)[3]/td"));
        for(WebElement element : listTwo){
            System.out.println("Value form 3rd row "+element.getText());
        }

        //Find and print the cell value at the second row and second column.
        System.out.println(driver.findElement(By.xpath("(//table[contains(@class,'ui celled')]/tbody//following-sibling::tr)[2]/td[2]")).getText());
        driver.quit();

      }
    }
