package zonlineStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.ebay.com/");
        driver.manage().window().maximize();

        //find the element

        WebElement electronics= driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"));
        // call the actions class
        Actions action=new Actions(driver);
        Thread.sleep(1000);
        action.moveToElement(electronics);
        action.perform();

    }
}
