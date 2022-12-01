package Test;

import Utils.CommonMethods;
import pages.loginPageWithPageFactory;


public class LoginPageTestWithPageFactory {
    public static void main(String[] args) {
        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");
        loginPageWithPageFactory login =new loginPageWithPageFactory();
        login.usernamefield.sendKeys("Admin");
        login.passwordfield.sendKeys("Hum@nhrm123");
        login.loginbtn.click();
    }
}
