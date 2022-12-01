package Test;

import pages.LoginPage;

import static Utils.CommonMethods.openWithSpecificUrl;

public class LoginPageTest {
    public static void main(String[] args) {


        openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //call the class where we created the webelements and call the webElement to perform testing
        LoginPage login=new LoginPage();
        // calling the webelemetn username
        login.userNameField.sendKeys("admin");

        login.passwordField.sendKeys("Hum@nhrm123");

        login.loginButton.click();




    }
}
