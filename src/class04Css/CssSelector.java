package class04Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
        driver.manage().window().maximize();

       // driver.findElement(By.cssSelector("input[placeholder*='Please enter']")).sendKeys("Pleae Show the message");
        // ^ second method to perfor above function

            //storing the above in webElement
            // is ko hm variable may save karain gy. neechay wala element ko hi return kary ga
        WebElement textbox = driver.findElement(By.cssSelector("input[placeholder*='Please enter']"));
                    textbox.sendKeys("please shew the message by second way");

                    WebElement button=driver.findElement(By.cssSelector("button[onclick^='showInput']"));
                    button.click();


    }
}
