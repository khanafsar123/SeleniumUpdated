package reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1Frame {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();

        WebDriver frame0 = driver.switchTo().frame(0);

        driver.switchTo().frame(0);

        WebElement checkbox= driver.findElement(By.xpath("//input[@id='a']"));
        checkbox.click();

        //        switch the focus back to home content
        driver.switchTo().defaultContent();

//          switching to the frame which has drop down
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frame);

//        find the select tag
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));

        Select sel= new Select(dropDown);

        sel.selectByIndex(1);






    }}
