package class09DynamicTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class OnlinePractice {
    public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");

        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
        int rowSize= rows.size();

        List<WebElement> columns=driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td[1]"));

        for(int i=1; i<rows.size(); i++) {
            String text=rows.get(i).getText();
            System.out.println(text);

            for (int j=i; j<columns.size(); j++) {

                List<WebElement> checkbok=driver.findElements(By.xpath("//table[@id='countries']/tbody/tr/td[1]"));
                WebElement check= checkbok.get(j);
                List<WebElement> columns1=driver.findElements(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td["+j+"]"));
                check.click();
                //columns1.get(j).click();



                if(text.equalsIgnoreCase("Kabul") || text.equalsIgnoreCase("Afghanistan")) {

                }


            }
            System.out.println();
        }

    }}
