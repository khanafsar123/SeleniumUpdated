package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleCheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        //Select the path that find all the checkBoxes

        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));


       /* for(WebElement list:checkboxes) {
            String newList=list.getAttribute("value");
            if(newList.equalsIgnoreCase("Option-3") || newList.equalsIgnoreCase("Option-4")) {
                list.click();
            }
        }*/

        for(int i=0; i< checkboxes.size(); i++) {
            WebElement eList= checkboxes.get(i);
            String text= eList.getAttribute("value");
            if(text.equalsIgnoreCase("Option-3") || text.equalsIgnoreCase("Option-4")) {
                eList.click();
            }
        }


























     /*
        // traverse through the list to find the required one

        for(WebElement checkbox:checkboxes) {
            // get the attribute value to get the links
            String optionList=checkbox.getAttribute("value");

            // if condition to select the right box
            // if checking all remove the if statement
            if(optionList.equalsIgnoreCase("Option-3")) {
                checkbox.click();
            }

        }*/






}}
