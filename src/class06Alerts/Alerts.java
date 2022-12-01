package class06Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();

        WebElement simpleAlert=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();

        Thread.sleep(1500);
        Alert simpleAlert1=driver.switchTo().alert();
        simpleAlert1.accept();


        // find the button for confirmation alert and clickon it
        WebElement confirmationAlert=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmationAlert.click();

        Thread.sleep(1000);
        Alert confirAlert=driver.switchTo().alert();
        confirAlert.dismiss();

        WebElement promp=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promp.click();

        Thread.sleep(2000);
        Alert prompAlert=driver.switchTo().alert();
        prompAlert.sendKeys("khan");
        prompAlert.accept();




    }}
