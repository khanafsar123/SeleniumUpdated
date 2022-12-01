package reviewClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        WebElement createAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();
        Thread.sleep(500);

        // if there is select tag we use select Class
        // 1. find the element/path that contains the select tag
        // 2. Create the select class and in parameter pass the WebElement variable

        // Step 01
        WebElement month= driver.findElement(By.xpath("//select[@id='month']"));

        //Step 02
        Select monthSelect=new Select(month);
        // if not using the loop through all use the predefined mehtods
        // like we used index 5, we can use
        monthSelect.selectByIndex(5);




        // if we have select method available we can print all the available options in the drop down
        // for example List of Months

        List<WebElement> options=monthSelect.getOptions();

        for (int i=0; i< options.size(); i++) {
            String months=options.get(i).getText();
            System.out.println(months);
        }






        /*
            We have now three methods
//        1.Select by index
        sel.selectByIndex(4);
        Thread.sleep(2000);
//        2.Select by visible Text
        sel.selectByVisibleText("31");
        Thread.sleep(2000);
//        3.Select by Value
        sel.selectByValue("16");
         */







    }
}
