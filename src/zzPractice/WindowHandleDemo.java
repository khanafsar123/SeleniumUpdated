package zzPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleDemo {
    public static void main(String[] args) throws InterruptedException {
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

        Set<String> set=driver.getWindowHandles();
        System.out.println(set);

        for (String handle:set) {
            driver.switchTo().window(handle);
            String title=driver.getTitle();
            System.out.println(title);
            Thread.sleep(2000);
                 if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){

                    break;
                 }

        }

    }
}
