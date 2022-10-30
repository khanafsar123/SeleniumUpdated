package zzPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(3000);
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();
        driver.navigate().back();



    }
}
