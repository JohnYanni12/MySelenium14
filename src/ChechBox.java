import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChechBox {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php%22");
        driver.manage().window().maximize();

//        //find the checkbox
//        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));
////        click on it
//        checkBox.click();
    }
    }
