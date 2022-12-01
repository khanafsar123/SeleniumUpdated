package class09DynamicTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DynamicMapTry {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.manage().window().maximize();


        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
        Map<String, String> mapAdd=new LinkedHashMap<>();
        List<WebElement> procductList=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
        for(int i=0; i< procductList.size(); i++) {
            String text=procductList.get(i).getText();
            List<WebElement> header=driver.findElements(By.xpath("//table[@Class='SampleTable']/tbody/tr"));
            String header1=header.get(i).toString();
            List<WebElement> checkboxList=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[1]"));
            for(int j=i; j< checkboxList.size(); j++) {
                mapAdd.put(header1,text);
                WebElement list= checkboxList.get(j);
            if(text.equalsIgnoreCase("MyMoney")) {
                list.click();
                System.out.println("rows Selected " +(i+1));

                break;
            }
                for(Map.Entry<String, String> print:mapAdd.entrySet()){
                    System.out.println(print.getKey() +":"+print.getValue());
                }
        }}




    }}
