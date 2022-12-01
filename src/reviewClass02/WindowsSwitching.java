package reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowsSwitching {
    public static void main(String[] args) throws InterruptedException {
        /*
        1.goto
http://accounts.google.com/signup
2.click on help and privacy btn
3.click on community Button
4.goto gmail.com page and enter your user name in form

         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //1 go to gmail signup linke
        driver.get("http://accounts.google.com/signup");
        driver.manage().window().maximize();


        WebElement helpbtn= driver.findElement(By.xpath("//a[text()='Help']"));
        helpbtn.click();
        String currentHandle= driver.getWindowHandle();

        Set<String> allHandle = driver.getWindowHandles();

        for(String handle:allHandle){

            driver.switchTo().window(handle);
            String allText=driver.getTitle();
            if(allText.equalsIgnoreCase("Create your Google Account")) {
                System.out.println("The title is : "+allText);
                break;
            }
        }

        WebElement name= driver.findElement(By.xpath("//input[@id='firstName']"));
        name.sendKeys("khan");

        Thread.sleep(1000);
        WebElement comunity= driver.findElement(By.xpath("//a[text()='Privacy']"));
        comunity.click();

        driver.switchTo().window(currentHandle);

    }









}
