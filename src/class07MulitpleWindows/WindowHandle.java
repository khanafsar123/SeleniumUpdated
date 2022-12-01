package class07MulitpleWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main (String[] args){

    System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

    WebDriver driver=new ChromeDriver();

   //1 go to gmail signup linke
      driver.get("http://accounts.google.com/signup");

      String gmailHandle = driver.getWindowHandle();
        System.out.println(gmailHandle);










}}
