package class08Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TableBasics {
    public static void main(String[] args) {

        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

      /*  WebElement table= driver.findElement(By.xpath("//table[@id='customers']"));
        String text=table.getText();
        System.out.println(text);*/

        // agr hamy sirf second row chahiye /tr[2]
        List<WebElement> table1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row : table1) {

           /* Map<String,String> map=new HashMap<>();
            String row = map.put(table);*/

            String rowText = row.getText();
            if (rowText.contains("Google")) {
                System.out.println(rowText);
            }
        }

        // printing coulums
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement column : columns) {

           /* Map<String,String> map=new HashMap<>();
            String row = map.put(table);*/

            String columnText = column.getText();
            if (columnText.contains("Google")) {
                System.out.println(columnText);
            }
        }

        //        print all the individual columns of the table
        List<WebElement> columns2 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement column:columns2){
            String columntext = column.getText();
            System.out.println(columntext);
            System.out.println("-----------------");
        }


    }}














