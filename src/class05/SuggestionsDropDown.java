package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SuggestionsDropDown {
    public static void main(String[] args) {
        //input[@name='bkmgFlights_origin_trip_1']
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.aircanada.com/us/en/aco/home.html");
        driver.manage().window().maximize();
        //WebElement form= driver.findElement(By.xpath("//abc-typeahead[@formcontrolname='destination']//div[@class='abc-form-element-main-container']"));
       // form.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement from= driver.findElement(By.xpath("//input[@id='bkmgFlights_destination_trip_1']"));

        from.sendKeys("Toronto");

        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ENTER);


    }
}
