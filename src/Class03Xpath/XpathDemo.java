package Class03Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

            // 1---from facebook bage enter user name
            // xpath to identify by attribute
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("khanafsar456");
        Thread.sleep(2000);


        // 2-- xpth identifying by text
            //driver.findElement(By.xpath("//a[text() = 'Forgot password?']")).click();

        // 3 -- xpath to identify by contains Method
        // tagname[contains(@attribute, 'partial attribute value')]
        //driver.findElement(By.xpath("//button[contains(@type,'subm')]")).click();

        //3.1 contains Text Method

      //  driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();


        // 4 Xpath to identify by Start with\
        // tagname[starts-with(@attribute, 'partial starting attribute value')]

        driver.findElement(By.xpath("//input[starts-with(@name,'pas')]")).sendKeys("123456");
        Thread.sleep(2000);
        driver.close();










    }
}
