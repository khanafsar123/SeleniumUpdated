package zzPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownPractice {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        WebElement createAccount= driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
        Select select=new Select(month);
       // select.selectByIndex(9);
        List<WebElement> allOptions = select.getOptions();
        for(int i=0; i<allOptions.size(); i++) {
            WebElement list=allOptions.get(i);
            String text= list.getText();

            if(text.equalsIgnoreCase("May")) {
                list.click();
            }
        }

        List<WebElement> checkBox = driver.findElements(By.xpath("//span[@class='_5k_2 _5dba']"));
        for(int i=0; i< checkBox.size(); i++) {
            WebElement check=checkBox.get(i);
            String text= check.getText();
            System.out.println(text);
            if(text.equalsIgnoreCase("Female")) {
                check.click();
            }
        }
    }}
