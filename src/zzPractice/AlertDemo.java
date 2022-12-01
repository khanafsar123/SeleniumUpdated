package zzPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();

        WebElement alert= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert.click();

        Alert simpLe= driver.switchTo().alert();
        Thread.sleep(4000);
        simpLe.dismiss();



    }
}
