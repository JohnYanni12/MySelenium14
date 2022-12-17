package Test;

import Pages.LoginPage;
import Utils.CommonMethods;

public class LoginTest {
    public static void main(String[] args) {

        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        LoginPage login = new LoginPage();
        login.userNameField.sendKeys("admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginButton.click();
    }
}