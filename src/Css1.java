import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css1 {


        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

            WebDriver driver = new ChromeDriver();
            driver.get("http://syntaxprojects.com/basic-first-form-demo.php");
            driver.manage().window().maximize();
            Thread.sleep(1000);
            WebElement textBox =  driver.findElement(By.cssSelector("input[placeholder *= 'Please enter']"));
            textBox.sendKeys("John");

//            WebElement button =  driver.findElement(By.cssSelector("button[onclick^='show']"));
//            button.click();


        }
    }