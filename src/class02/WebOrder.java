package class02;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        driver.manage().window().maximize();

        // Enter user name and password

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();


        // Title is correct
       String title=driver.getTitle();
       if(title.equalsIgnoreCase("Web Orders")) {
           System.out.println("The Title is correct "+title);
       } else {
           System.out.println("The Title is incorrect"+title);
       }
      // chk with the sout
        //  System.out.println(title);




    }
}
