package class06Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class multipleFrames {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();
    // Step1: Switch to frame using by index
        // find by ctrl+f and checked 1/3 so index will be either 0 1 2
        driver.switchTo().frame(1);
        // find the text of above the drop down
        WebElement animalText = driver.findElement(By.xpath("//b[text()='Animals :']"));
        String text=animalText.getText();

        System.out.println(text);

        // now select the dropDown
        // first navigate
        WebElement dropDown1=driver.findElement(By.xpath("//select[@id='animals']"));

        Select select=new Select(dropDown1);
        Thread.sleep(1000);
        select.selectByValue("babycat");



        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement textbox=driver.findElement(By.xpath("//input"));
        textbox.sendKeys("done");

        WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));

        driver.switchTo().frame("frame3");

        WebElement checkbox=driver.findElement(By.xpath("//input[@id='a']"));
        checkbox.click();



    }


    }
/*
  public static void main(String[] args) {


        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        goto syntax project /dropDown demo
        driver.get("https://chercher.tech/practice/frames%22);

//        Task 1: Print the animals on screen and then  Select Baby Cat From The drop Down

//Step1: switch to the frame using by index
        driver.switchTo().frame(1);
//        find the  text animals and print on screen
        WebElement animalText = driver.findElement(By.xpath("//b[text()='Animals :']"));
        String text = animalText.getText();
        System.out.println(text);


//        check the check box
//seitch focu to the main page
        driver.switchTo().defaultContent();

//        switch to the frame containing the subframe which has checkbox
        driver.switchTo().frame("frame1");
        WebElement inputTxt = driver.findElement(By.xpath("//input"));
        inputTxt.sendKeys("abracadbra");

//        finding the frame through xpath and switching using BY Webelement method
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
//        find the checkbox
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

    }

}
 */
