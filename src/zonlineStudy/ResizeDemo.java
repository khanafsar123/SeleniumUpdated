package zonlineStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/resizable/");
        driver.manage().window().maximize();
        WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        WebDriver iframe=driver.switchTo().frame(frame);

        WebElement resize= driver.findElement(By.xpath("//div[@style='z-index: 90;'][3]"));

        Actions action=new Actions(driver);
        action.dragAndDropBy(resize, 200,80);
        action.perform();

    }
}
