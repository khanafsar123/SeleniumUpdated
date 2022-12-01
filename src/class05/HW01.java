package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW01 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1.Go to facebook
2.click on create New Account
3.Fill out the whole form
4.Take screen shot of filled out form manually and share in HW channel along with code
         */


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        //driver.findElement(By.cssSelector("img[src$='png']"));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("def");
        driver.findElement(By.cssSelector("input[aria-label*='Mobile number']")).sendKeys("def@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("def@gmail.com");
        driver.findElement(By.cssSelector("input[autocomplete*='new-password']")).sendKeys("123");

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
            // By select Method
        Select selectMonth=new Select(month);
        //use Select Method
        selectMonth.selectByVisibleText("Oct");

        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
            // By select Method

        Select selectDay=new Select(day);
        //use Select Method

        selectDay.selectByIndex(9);

        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
            // By select Method
        Select selectYear=new Select(year);
        //use Select Method
        selectYear.selectByVisibleText("1989");
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();





    }
}
