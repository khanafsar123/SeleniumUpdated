package reviewClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement name= driver.findElement(By.id("txtUsername"));
        // send user name
        name.sendKeys("Admin");

        WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
        // sending the wrong password
            password.sendKeys("abcedee");

            // Click on the login button
        WebElement btn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
                    btn.click();

                    // to check the invalid message
        // first do it on whe wepsite by entereing the wrong credentials.. now find the elements
        // get the error mesage from the dom
    /// error message is in the text

        WebElement errorMessage=driver.findElement(By.xpath("//span[@id='spanMessage']"));
        // message on the consol will be compared with the DOM
        String error=errorMessage.getText();
        System.out.println(error);

        //varification
        // Get the title from the DOM - Invalid credentials
        if(error.equalsIgnoreCase("Invalid credentials")) {
            System.out.println("The correct Error message is there ===> Varified");
        } else {
            System.out.println("The correct Error message is not there");
        }




    }}
