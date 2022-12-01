package class12JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorHighLight {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement username= driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='blue'", username);
    }
}
