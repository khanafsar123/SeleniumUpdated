package class10PaginationCalander;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();


        WebElement userName=driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("admin");
        WebElement password= driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        WebElement button=driver.findElement(By.xpath("//input[@id='btnLogin']"));

        button.click();

        WebElement recruitmentTag=driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recruitmentTag.click();


        WebDriverWait wait=new WebDriverWait(driver, 20);

        WebElement candidates=driver.findElement(By.xpath("//a[text()='Candidates']"));
        wait.until(ExpectedConditions.elementToBeClickable(candidates));
        candidates.click();

        WebElement calander= driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        calander.click();

        WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select=new Select(month);
        List<WebElement> allMonths = select.getOptions();

        for(int i=0; i< allMonths.size(); i++) {
            WebElement list=allMonths.get(i);
            String monthList=allMonths.get(i).getText();
            System.out.println(monthList);
            if(monthList.equalsIgnoreCase("Dec")) {
               list.click();
            }
        }



        WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1=new Select(year);
        List<WebElement> year1 = select1.getOptions();
        for(int i=0; i< year1.size(); i++) {
            WebElement list=year1.get(i);
            String yearList=year1.get(i).getText();
            System.out.println(yearList);
            if(yearList.equalsIgnoreCase("2024")) {
                list.click();
                break;
            }
        }

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        List<WebElement> days=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(int i=0; i< days.size(); i++) {
            WebElement day=days.get(i);
            String text= day.getText();
            System.out.println(text);
            if(text.equalsIgnoreCase("23")) {
                day.click();
                break;
            }
        }






    }
}
