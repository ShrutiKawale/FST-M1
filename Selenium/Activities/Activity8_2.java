package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2 {

    public static void main(String[] agrs) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        System.out.println("title of the page is " + driver.getTitle());

        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println("Number of Column are "+ cols.size()+ " Number of rows is "+rows.size());

        System.out.println("2nd row 2nd column value "+driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")));
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[2]")).click();
        System.out.println("2nd row 2nd column value post sorting"+driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")));
        System.out.println("Footer values "+driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr")));
        driver.quit();


    }

}
