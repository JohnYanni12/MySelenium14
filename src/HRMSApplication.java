import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMSApplication {

    public static void main(String[] args) {
        /*HW 2HRMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username.     Leave password field empty.      Click on login button
Verify error message with text “Password cannot be empty” is displayed.
you can use if else condition for verification of message */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("JohnGayed");
        WebElement button = driver.findElement( By.cssSelector("input[type='submit']"));
        button.click();
        WebElement massage = driver.findElement(By.cssSelector("span[id='spanMessage']"));
        System.out.println(massage.isDisplayed());
        if (massage.isDisplayed()){
            System.out.println("Please enter a valid password");
        }
    }
}