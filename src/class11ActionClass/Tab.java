package class11ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab {
    public static void main(String[] args) {
        //http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
        //input[@name='ctl00$MainContent$username']

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

        WebElement userName= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester", Keys.TAB);

        //we can use tab but can not send keys to the password so we will use the the webElement to send keys

        //What are enums
    }
}
