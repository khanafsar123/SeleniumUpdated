package zzPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TableMapOnline {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://sqengineer.com/practice-sites/practice-tables-selenium//");

        //ArrayList to add map Values
        List<Map<String,String>> arrayListForMaps=new ArrayList<>();


        //List of Header Row
        List<WebElement> allHeader=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/th"));
        // Make Keys as Header Row values
        List<String> key=new ArrayList<String>();
        String keysText="";
        for(WebElement header:allHeader) {
             keysText= header.getText();
            key.add(keysText);
        }

        //getting All-Rows
        List<WebElement> allRows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        for(int i=1; i< allHeader.size(); i++) {
            //Iteration throught each row
            List<WebElement> eachRow=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr["+i+"]"));
                //all columns elements
            List<WebElement> allColumns=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));

            // Create Map to store all keys and values
            Map<String,String> map=new LinkedHashMap<>();

            //get Cell Values
            for(int j=0; j<allColumns.size(); j++) {
                // get Cell Values
                String values=allColumns.get(j).getText();
                map.put(keysText, values);
            }
            arrayListForMaps.add(map);

        }

        System.out.println(arrayListForMaps);
    }
}
