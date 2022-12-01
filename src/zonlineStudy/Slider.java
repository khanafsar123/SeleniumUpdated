package zonlineStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/slider/");
        driver.manage().window().maximize();
        WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        WebDriver iframe=driver.switchTo().frame(frame);

        WebElement slider= driver.findElement(By.xpath("//div[@id='slider']"));

        Actions action=new Actions(driver);
        action.dragAndDropBy(slider,0,125);
        action.perform();

    }
}
