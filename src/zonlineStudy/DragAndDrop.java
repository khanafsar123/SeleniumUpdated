package zonlineStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        WebElement iframe= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        WebDriver frame = driver.switchTo().frame(iframe);

        // Drag Item
        WebElement dragElement= driver.findElement(By.xpath("//div[@id='draggable']"));

        //Drop Location
        WebElement dropLocation=driver.findElement(By.xpath("//div[@id='droppable']"));


        Actions action=new Actions(driver);
        action.dragAndDrop(dragElement,dropLocation);
        action.perform();

    }
}
