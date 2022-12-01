package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class abc {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();

      List <WebElement> categries=driver.findElements(By.xpath("//select[@name='_sacat']"));
        for(int i=0; i< categries.size(); i++) {
            WebElement newList= categries.get(i);
            String list= newList.getText();
            System.out.println(list);
        }
    }
}
