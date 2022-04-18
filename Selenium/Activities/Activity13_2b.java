package Activities;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.IOException;


public class Activity13_2b {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("**********");
        String path = "src\\main\\resources\\MyFile.xlsx";
        FileInputStream file = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(file);
        Sheet sheet = wb.getSheet("Sheet1");


            for(int j = 1;j<= sheet.getLastRowNum();j++){
                WebDriver driver = new FirefoxDriver();
                driver.get("https://www.training-support.net/selenium/simple-form");
            String firstname = String.valueOf(wb.getSheet("Sheet1").getRow(j).getCell(1));
            String lastname = String.valueOf(wb.getSheet("Sheet1").getRow(j).getCell(2));
            String email = String.valueOf(wb.getSheet("Sheet1").getRow(j).getCell(3));
            String phoneNo = String.valueOf(wb.getSheet("Sheet1").getRow(j).getCell(4));
            driver.findElement(By.xpath("//input[@id = 'firstName']")).sendKeys(firstname);
            driver.findElement(By.xpath("//input[@id = 'lastName']")).sendKeys(lastname);
            driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(email);
            driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys(phoneNo);
            driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
            Alert message = driver.switchTo().alert();
            System.out.println("Alert message: " + message.getText());
            Thread.sleep(5000);
            message.accept();
            driver.close();
        }

    }}

