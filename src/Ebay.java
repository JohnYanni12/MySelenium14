import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebay {


    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.ebay.com");
            driver.manage().window().maximize();
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select sel = new Select(dropdown);
        sel.selectByValue("58058");



    }
}
