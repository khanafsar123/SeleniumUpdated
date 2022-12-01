package pages;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utils.CommonMethods.driver;

public class LoginPage extends CommonMethods {

    //  No need for the main method

    //http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
    public WebElement userNameField = driver.findElement(By.id("txtUsername"));
    public WebElement passwordField = driver.findElement(By.id("txtPassword"));
    public WebElement loginButton = driver.findElement(By.id("btnLogin"));
    public WebElement LoginSign = driver.findElement(By.xpath(" //div[text()='LOGIN Panel']"));




    }
