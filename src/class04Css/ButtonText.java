package class04Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;


public class ButtonText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        //Find the WebElement button
        WebElement btn= driver.findElement(By.cssSelector("button#buttoncheck"));

        //get the text from the btn webelement
        String text=btn.getText();

        // print it on the console
        System.out.println(text);



        // get the value of th eattribute "id" from the webElement
        String idValue=btn.getAttribute("id");
        System.out.println(idValue);

        List<WebElement> webElement=driver.findElements(By.cssSelector("li.tree-branch"));
      /*  for (int i=0; i< webElement.size(); i++){
            String linkValue= WebElement.getAttribute("class");
            System.out.println(linkValue);
        }
        System.out.println("By Using for loop");*/

        for(WebElement list:webElement) {
            String linkValue=list.getAttribute("class");
            System.out.println(linkValue);

        }








    }
}
