package class11ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HoverTheMouse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com/");
        driver.manage().window().maximize();



        driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();


        WebElement mouseHover= driver.findElement(By.xpath("(//span[text()='All'])[2]"));

        Actions action=new Actions(driver);
        action.moveToElement(mouseHover).perform();




    }

}
