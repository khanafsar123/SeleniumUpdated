package class02;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {

        // launch facebook
        // enter user name
        // enter passwore

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        // launch facebook
        driver.get("https://www.facebook.com/");
        // good practice to maximize window
        driver.manage().window().maximize();

        // to enter username : locate the elements and send the keys

        // use the findElement not the Elements
        driver.findElement(By.id("email")).sendKeys("khanafsar");
        // now enter password
        // a locatro have spaces or inpu_55ri because they are dynamic use static code do not use that
        // use better locators
       // driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("abc234");
        driver.findElement(By.name("pass")).sendKeys("abc234");
        // driver.findElement(By.name("login")).click();


        // task 02 : Click on forgot password
        // forgot password no Id or class we will use the linkText

      //  driver.findElement(By.linkText("Forgot password?")).click();

        // Task03
        // Forgot Password using Partial linkText locator


        // we use this locator because if text is lengthy we just take the first text
        //driver.findElement(By.partialLinkText("Forgot")).click();








    }
}
