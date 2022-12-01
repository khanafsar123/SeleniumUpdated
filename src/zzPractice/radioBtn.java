package zzPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioBtn {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        List<WebElement> createNew= driver.findElements(By.xpath("//input[@name='exp']"));

        for(WebElement list:createNew){
            System.out.println(list.isSelected());
            String allElement = list.getAttribute("id");
            if(allElement.equals("exp-2")) {
                list.click();
            }
        }

        WebElement upload= driver.findElement(By.xpath("//input[@id='photo']"));
        upload.sendKeys("C:\\Users\\camro\\OneDrive\\Desktop\\DataStructure.png");


    }}
