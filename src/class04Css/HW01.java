package class04Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.cssSelector("input#txtUsername"));
        userName.sendKeys("Admin");

        WebElement passWord=driver.findElement(By.xpath("//input[@name='txtPassword']"));

                passWord.sendKeys("Hum@nhrm123");

        WebElement button=driver.findElement(By.cssSelector("input#btnLogin"));
        String txt=button.getText();

        button.click();



    }
}
