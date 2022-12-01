package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class MultipleDropDonList {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();


        WebElement DD=driver.findElement(By.xpath("//select[@id='multi-select']"));

        // use select class

        Select select=new Select(DD);

        // Select one item to select other use idex method or same method
        select.selectByValue("Texas");
        select.selectByIndex(2);


        // if we want to deselect
        select.deselectAll();


        // if we are using for loop use List class and webelement as dataTye and varialbe in the object

        //List<WebElement> newElement=new ArrayList<>()
            // to get all the options use getOptions() method

        /*List<WebElement> options=select.getOptions();

        for (int i=0; i<options.size(); i++) {
            WebElement newElements = options.get(i);
            String list = newElements.getText();
            System.out.println(list);
        }*/

        // using the select class

        List<WebElement> options=select.getOptions();
        for(int i=0; i<options.size(); i++) {
            select.selectByIndex(i);
        }

        // how to check if its multi-select or not (DropDown)
        // isMultiple method is coming form the select class
        boolean multiSelect=select.isMultiple();
        System.out.println(multiSelect);

}}
