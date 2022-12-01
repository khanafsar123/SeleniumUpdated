package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        WebElement dropDown= driver.findElement(By.xpath("//select[@id='select-demo']"));

        // it containss select Tag so we will be using the select class

        Select selectDrop=new Select(dropDown);
        // selcect the option by indes
        // we want to select Thursday
        selectDrop.selectByIndex(5);
        Thread.sleep(2000);

                         // visible attribute
       // selectDrop.selectByVisibleText("Friday");
        //Thread.sleep(2000);

                         // value of the value Attribute
       // selectDrop.selectByValue("Wednesday");


                         // get all the options available in the drop down

        List<WebElement> dropList=selectDrop.getOptions();

        for(int i=0; i<dropList.size(); i++) {
            WebElement newList=dropList.get(i);
            //System.out.println(newList.getText());
            // now assign to text
            String list=newList.getText();
            //if(list.equalsIgnoreCase("Friday")) {
            Thread.sleep(2000);
                selectDrop.selectByIndex(i);
           // }
        }


}}
