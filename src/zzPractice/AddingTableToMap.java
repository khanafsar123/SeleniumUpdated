package zzPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AddingTableToMap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://sqengineer.com/practice-sites/practice-tables-selenium//");

        //table[@id='table1']/tbody/tr[1]/th
        //table[@id='table1']/tbody/tr

        List<Map<String,String>> arrayList=new ArrayList<>();

        List<WebElement> headerRow=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        List<WebElement> columnData=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));

        for(int i=0; i< headerRow.size(); i++) {
            Map<String, String> map=new LinkedHashMap<>();
           List<WebElement> headRowData=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr["+i+"]"));
            WebElement keysElement= headerRow.get(i);
            String keys= keysElement.getText();
            //System.out.println(keys);




            for(int j=1; j< columnData.size(); j++) {

                List<WebElement> CellData=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr["+(i+1)+"]/td["+(j+1)+"]"));
                WebElement valuesElement= columnData.get(j);
                String value=valuesElement.getText();
                //System.out.println(value);

                map.put(keys,value);

            }
            arrayList.add(map);
            System.out.println(map);

        }
        System.out.println(arrayList);



    }
}
