package zonlineStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");

        WebElement button= driver.findElement(By.xpath("//button[@id='startButton']"));
        System.out.println(button.getSize());
        System.out.println(button.getLocation());
        System.out.println(button.getCssValue("display"));


    }
}
