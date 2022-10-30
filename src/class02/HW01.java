package class02;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Khan");
        driver.findElement(By.name("customer.lastName")).sendKeys("Afsar");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Street NW");
        driver.findElement(By.name("customer.address.city")).sendKeys("Edmonton");
        driver.findElement(By.id("customer.address.state")).sendKeys("Alberta");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("N5R1H2");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123-456-7889");
        driver.findElement(By.id("customer.ssn")).sendKeys("123456");
        driver.findElement(By.id("customer.username")).sendKeys("khanafsar");
        driver.findElement(By.id("customer.password")).sendKeys("abc123");
        driver.findElement(By.name("repeatedPassword")).sendKeys("abc123");
        Thread.sleep(1000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        driver.close();






    }
}
