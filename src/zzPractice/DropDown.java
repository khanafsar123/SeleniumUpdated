package zzPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement createNew= driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNew.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("def");
        driver.findElement(By.cssSelector("input[aria-label*='Mobile number']")).sendKeys("def@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("def@gmail.com");
        driver.findElement(By.cssSelector("input[autocomplete*='new-password']")).sendKeys("123");

        WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
        Select select=new Select(month);

        List<WebElement> options=select.getOptions();

        for(int i=0; i< options.size(); i++){
            WebElement list=options.get(i);
            String listText= list.getText();
            if(listText.equalsIgnoreCase("Dec")) {
                select.selectByIndex(6);
            }
        }







       /* List<WebElement> month = driver.findElements(By.xpath("//option[@value]"));

        for (int i=0; i<month.size(); i++) {
            WebElement monthList= month.get(i);
            String newList=monthList.getText();
            System.out.println(newList);

            if(newList.equalsIgnoreCase("Dec")) {
                monthList.click();
            }
        }
*/






    }}
