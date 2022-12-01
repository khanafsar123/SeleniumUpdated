package class08Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class implicitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement button1= driver.findElement(By.xpath("//button[@id='populate-text']"));
        button1.click();

        WebElement webDirverText=driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));

        // get the text
        String text=webDirverText.getText();
        System.out.println(text);

        WebElement btn2=driver.findElement(By.xpath("//button[text()='Display button after 10 seconds']"));
        btn2.click();

        // explicit condition

        WebDriverWait explicitWait= new WebDriverWait(driver, 20);
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));

        WebElement visibleBtn= driver.findElement(By.xpath("//button[@id='hidden']"));
        visibleBtn.click();

    }
}
