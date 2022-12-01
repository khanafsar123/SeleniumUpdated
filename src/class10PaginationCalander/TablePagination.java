package class10PaginationCalander;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablePagination {
    public static void main(String[] args) {

        // if the table contain multiple pages and our element is not known on the first page
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("admin");
        WebElement password= driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        WebElement button=driver.findElement(By.xpath("//input[@id='btnLogin']"));

        button.click();

        WebElement PIM=driver.findElement(By.xpath("//b[text()='PIM']"));
        PIM.click();

        WebElement employeeList=driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeList.click();






       /* boolean idFound=false;
        while(!idFound) {
            //        get all the ids from the columns
            List<WebElement> columnID = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
            for (int i = 0; i < columnID.size(); i++) {

//extract the id from the entry in list
                String id = columnID.get(i).getText();
//            check if it is the desired id
                if (id.equalsIgnoreCase("40907A")) {
//                check the checkbox associated with this particular  row
                    System.out.println("i have found the id on row number " + (i + 1));
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    idFound=true;
                    break;
                }

            }
            if (!idFound){
                WebElement nextButton = driver.findElement(By.xpath("//a[text()='Next']"));
                nextButton.click();
            }
        }*/

        List<WebElement> idList=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for(int i=0; i<idList.size(); i++) {
            String text=idList.get(i).getText();
            List<WebElement> idList2=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

            String idText=idList2.get(i).getText();

            WebElement checkBox=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]"));
            for(int j=0; j<idList2.size(); j++) {
            if (!idText.equalsIgnoreCase("42778A")) {
                WebElement next=driver.findElement(By.xpath("// a[text()='Next']"));
                next.click();

            } else if (text.equalsIgnoreCase("42778A")) {
                System.out.println("Index of the row is::" + (i+1));

                checkBox.click();

            } }



        }






    }}
