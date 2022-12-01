package class07MulitpleWindows;

import com.google.common.collect.Multiset;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //1 go to gmail signup linke
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");

        WebElement button= driver.findElement(By.id("startButton"));
        button.click();

        // find the text
        WebElement welcomeText= driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text= welcomeText.getText();
        System.out.println("The text is "+text);


    }
}
