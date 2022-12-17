import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WelcomAdminHw1 {
   /* HW1
    Open chrome browser
    Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
    Enter valid username and password (username - Admin, password - Hum@nhrm123)
    Click on login button
    Then verify the message "Welcome Admin " is there on the top right corner*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        //boolean displayStatus = .isDisplayed();
        boolean displayStatus =  driver.findElement(By.cssSelector("a[id='welcome']")).isDisplayed();
        if(displayStatus){
            System.out.println("Welcome Admin is displayed");
        }
        else{
            System.out.println("Welcome Admin is NOT displayed");
        }
    }
}
