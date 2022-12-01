package reviewClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

            WebDriver driver=new ChromeDriver();

            driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
            driver.manage().window().maximize();
            List<WebElement> radioButton=driver.findElements(By.xpath("//input[@name='ageGroup']"));

            // traverse through the list
            for(WebElement list:radioButton) {
                // attribute associted with text
                String options=list.getAttribute("value");


                if(options.equalsIgnoreCase("5 - 15")) {
                    // we are not using options because options is String and we can not click text
                    list.click();
                }
            }



    }
}
