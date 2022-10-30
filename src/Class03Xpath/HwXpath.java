package Class03Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwXpath {
    public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()=' Start Practising ']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'Simple Form Demo')][contains(@class,'list-group')]")).click();
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("display message");
        driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();





    }}
