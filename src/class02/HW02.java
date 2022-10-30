package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Khan");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("khan");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email__")).sendKeys("12345678");
        Thread.sleep(1000);
        driver.findElement(By.id("password_step_input")).sendKeys("abc123");

        driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yZ/r/C6QZ-pcv3Bd.png']")).click();





    }
}
