package reviewClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://ironspider.ca/forms/checkradio.htm");
        // find the checkBoxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@name='color']"));

        // use loop to get all the elements

        for (WebElement checkbox:checkboxes) {
            // text ko is liye use nhe kia wo closing brackets ky bahir tha
            String color=checkbox.getAttribute("value");
            if (color.equalsIgnoreCase("blue")){
                checkbox.click();
                break; // jab blue ko select kr ly ga to loop end ho jay ga is ky baad loop baqi elements ko run nhe kary ga
            }
        }
    }
}
