import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* fill out the form; click on register, close the browser */
public class FormFillOut {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("John");
        driver.findElement(By.id("customer.lastName")).sendKeys("Yanni");
        driver.findElement(By.id("customer.address.street")).sendKeys("123");
        driver.findElement(By.id("customer.address.city")).sendKeys("Rochester");
        driver.findElement(By.id("customer.address.state")).sendKeys("MN");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("55902");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("213-434-5599");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-31-6789");
        driver.findElement(By.id("customer.username")).sendKeys("JohnYanni");
        driver.findElement(By.id("customer.password")).sendKeys("002fdSDf");
        driver.findElement(By.id("repeatedPassword")).sendKeys("002fdSDf");
        driver.findElement(By.className   ("button")).click();
        driver.quit();
    }
}