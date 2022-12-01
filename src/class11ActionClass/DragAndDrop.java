package class11ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        WebDriver frame = driver.switchTo().frame(0);
        
        WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action=new Actions(driver);
        /*action.dragAndDrop(drag,drop);
        action.perform();
        */
        // withClick and hold
        // agr ham 2 methods use kr rahay hain to last may .build().perform() karna hy]

        action.clickAndHold(drag).moveToElement(drop).release().build().perform();




    }}
