package class11ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();

        WebElement btn= driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action=new Actions(driver);
        //action.clickAndHold(btn).ri

    }
}
