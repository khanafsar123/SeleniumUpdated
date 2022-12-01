package class04Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String[] args) {


    System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

    WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        boolean displayStatus=maleRadioBtn.isDisplayed();
        //print the display status
        System.out.println("The radio button is Displayed::"+displayStatus);




        boolean enableStatus=maleRadioBtn.isEnabled();
        System.out.println("Is the radio button enabled:: "+enableStatus);

        boolean selectStatus=maleRadioBtn.isSelected();
        System.out.println("is the button selected:: " +selectStatus);

        // if the button is not selected then click on it

        if(selectStatus!=true) { // boolean default value is true so if not equal to true
            // if(!selectStatus)
            maleRadioBtn.click();
        }

        // now check the status again
        selectStatus=maleRadioBtn.isSelected(); // reassining
        System.out.println("The radio button is selected:: " +selectStatus);

}}
