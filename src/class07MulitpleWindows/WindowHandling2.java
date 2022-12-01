package class07MulitpleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandling2 {
    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //1 go to gmail signup linke
        driver.get("http://accounts.google.com/signup");

        String gmailHandle = driver.getWindowHandle();


        WebElement helpbtn=driver.findElement(By.xpath("//a[text()='Help']"));
        helpbtn.click();

        WebElement privacyBtn= driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();
        
        // get all window handles

        Set<String> allHandles = driver.getWindowHandles();
        //get the title from inspect the windwo you want ....>>> Google Account Help

        for(String handle:allHandles){
            // switching the focus to the current handle from the list
            driver.switchTo().window(handle);

            // get the title of the window
            String title= driver.getTitle();

            if(title.equalsIgnoreCase("Google Account Help")) {
                System.out.println("The current page under focus is : "+title);
                break;
            }

        }

        // now click on the community
        WebElement comunity= driver.findElement(By.xpath("//a[text()='Community']"));
        comunity.click();











}}
