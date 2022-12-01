package class07MulitpleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaits {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //1 go to gmail signup linke
        driver.get("http://www.facebook.com/");

        WebElement createAcc= driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAcc.click();

        WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("khan");
    }
}
