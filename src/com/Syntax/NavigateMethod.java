package com.Syntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        /*
                1. go to google .com
                2. go to fb.com
                3. come back to google.com

         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // create instance of the driver

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com?");

        // open facebook
        driver.navigate().to("https://www.facebook.com/");


        // it will hold websit for 5 or different sec and will comebakc
        // it will pause the code for the 4 seconds
        Thread.sleep(4000);

        // going back to google.com
        driver.navigate().back();

        // go backto facebook.com
        // actually we are going forward
        Thread.sleep(4000);
        driver.navigate().forward();

        Thread.sleep(4000);
        // refresh the page

        driver.navigate().refresh();


        // close the browser
        driver.quit();







    }

}
