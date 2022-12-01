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

public class HWCalander {
    public static void main(String[] args) {
        //Drivers/chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //driver.navigate().to("Drivers/chromedriver.exe");
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


        WebElement month = driver.findElement(By.xpath(" //select[@class='ui-datepicker-month']"));


        Select month1 =new Select(month);
        //month1.selectByVisibleText("Aug");

        List<WebElement> monthOption = month1.getOptions();
        for (int i=0; i< monthOption.size(); i++) {
            WebElement monthElement=monthOption.get(i);
            String textMonth=monthElement.getText();
            System.out.println(textMonth);
            if(textMonth.equalsIgnoreCase("Aug")) {
                monthElement.click();
            }
        }

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        year.click(); //

       Select select1=new Select(year);
        select1.selectByVisibleText("2024");
        List<WebElement> year1 = select1.getOptions();
        for(int i=0; i< year1.size(); i++) {
            WebElement list=year1.get(i);
            String yearList=year1.get(i).getText();
            System.out.println(yearList);
            if(yearList.equalsIgnoreCase("2024")) {
                list.click();
            }
        }


        List<WebElement> days=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(int i=0; i< days.size(); i++) {
            WebElement dayElements= days.get(i);
            String dayText= dayElements.getText();
            System.out.println(dayText);
            if(dayText.equalsIgnoreCase("12")) {
                dayElements.click();
            }
        }





    }}
