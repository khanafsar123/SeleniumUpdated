package reviewClass02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        WebElement alert= driver.findElement(By.xpath("//button[@id='alertButton']"));
        alert.click();

        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        WebElement alertbtn2= driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        alertbtn2.click();





    }}
