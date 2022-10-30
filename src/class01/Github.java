package class01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github {
    public static void main(String[] args) throws InterruptedException {
                        //webdriver.chrome.driver

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);

        Thread.sleep(4000);

        driver.getTitle();
        driver.getCurrentUrl();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.manage().window().getPosition();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().to("https://www.github.com/");


    }
}
