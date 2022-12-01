package zzPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //1 go to gmail signup linke
        driver.get("http://accounts.google.com/signup");

        String gmailHandle = driver.getWindowHandle();
        System.out.println(gmailHandle);


        WebElement helpbtn=driver.findElement(By.xpath("//a[text()='Help']"));

        helpbtn.click();



        WebElement privacyBtn= driver.findElement(By.xpath("//a[text()='Privacy']"));

        privacyBtn.click();



        Set<String> allHandles = driver.getWindowHandles();
        System.out.println(allHandles);
        Iterator<String> iterator=allHandles.iterator();

        while (iterator.hasNext()) {
            String item=iterator.next();
            driver.switchTo().window(item);
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Google Account Help")) {
                System.out.println("The title of current page is: "+title);
                break;
            }

        }


       /* for (String handle:allHandles) {
            driver.switchTo().window(handle);

            Thread.sleep(1000);
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Google Account Help")) {
                System.out.println("The title of current page is: "+title);
                break;
            }


        }*/


}}
