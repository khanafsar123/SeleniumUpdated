package class01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {
        // goto google
        // maximize the window

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        // maximize the window
        driver.manage().window().maximize();

        // full Screen
        // use manage method>launch window >and full screen
        driver.manage().window().fullscreen();

        driver.quit();



    }
}
