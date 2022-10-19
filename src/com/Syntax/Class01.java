package com.Syntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class01 {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class
    System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
    // create a webdriver instance
        WebDriver driver=new ChromeDriver();

        // use the get() function to open up the required website
        driver.get("https://www.google.com/");

        // print or get the url of the website
        // save the result in string
        String str=driver.getCurrentUrl();
        System.out.println(str);

        // get the title --- web developer decide the title
        String title=driver.getTitle();

        System.out.println(title);

        // close the whole browser
        driver.quit();

        // close > close the current tab only
        driver.close();

    }

}
