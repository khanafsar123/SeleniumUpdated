package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://ebay.com");
        driver.manage().window().maximize();

        // get all the links i.e anchor tags from the website
        List<WebElement> ebayLinks = driver.findElements(By.tagName("a"));

        // print the size of the list
        System.out.println("The size of the list is:: " +ebayLinks.size());

        // the value of the links is store in the attributes i.e. href
        // so href contins the links

        for (WebElement ebayLink:ebayLinks) {

            // extracting the value of the attribute href because it contains the link embedded in the Webelement
            String link= ebayLink.getAttribute("href");

            System.out.println(link);
        }




    }
}
