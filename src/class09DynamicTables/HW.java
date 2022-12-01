package class09DynamicTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("admin");
        WebElement password= driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        WebElement button=driver.findElement(By.xpath("//input[@id='btnLogin']"));

        button.click();

        WebElement PIM=driver.findElement(By.xpath("//b[text()='PIM']"));
        PIM.click();

        WebElement employeeList=driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeList.click();

        List<WebElement> idList=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        for(int i=0; i<idList.size(); i++) {
             String text=idList.get(i).getText();
             if (text.equalsIgnoreCase("40905A")) {
                 System.out.println("Index of the row is::" + (i+1));
                 WebElement checkBox=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]"));
                        checkBox.click();
             }
        }
    }
}
