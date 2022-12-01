package class06Alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        String userName="admin";
        String passWord="admin";


        String URL="https://" +userName+ ":"+passWord+ "@"+ "the-internet.herokuapp.com/basic_auth";
        Thread.sleep(4000);
        driver.get(URL);





    }
}
