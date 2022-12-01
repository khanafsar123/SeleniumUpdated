package zonlineStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/slider/");
        driver.manage().window().maximize();
        WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        WebDriver iframe=driver.switchTo().frame(frame);

        // right Click anywhere in the frame

        Actions action=new Actions(driver);
        action.contextClick();
        action.perform();

    }}
