package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/*
1.Go to ebay.com
2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
3.select Computers/Tables & Networking
4.click on search
5.verify the title
 */
public class HW02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();
        // get all the categories


        // Using List Method -> without List Class
        List<WebElement> categories= driver.findElements(By.cssSelector("select#gh-cat"));
        for(int i=0; i<categories.size(); i++) {
            WebElement elList= categories.get(i);
            String txtList= elList.getText();
            System.out.println(txtList);
        }
        System.out.println("============Using Enhanced For Loop");
          for(WebElement abc:categories){
              String tx= abc.getText();
              System.out.println(tx);
          }

        System.out.println("Using Iterator======");

          var iterator=categories.iterator();
          while (iterator.hasNext()) {
              WebElement list = iterator.next();
              String txtList= list.getText();
              System.out.println(txtList);
          }



        /*Select selectCat=new Select(categories);
        // Select All function is not in the Select Class
        // create list of all the dropDown to get all the available options
        List<WebElement> dropList=selectCat.getOptions();
        // using for loop to select all the categories
        for (int i=0; i<dropList.size(); i++) {
           WebElement elementList=dropList.get(i);
           // convert list of element to list of text
            String txtList= elementList.getText();
            System.out.println(txtList);
            if(txtList.equalsIgnoreCase("Computers/Tablets & Networking")){
                selectCat.selectByIndex(i);
            }
        }
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        String title= driver.getTitle();
        System.out.println(title);
        if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")) {
            System.out.println("The Title is varified::"+title);
        } else {
            System.out.println("Title is different, Please change the title::"+title);
        }*/




    }
}
