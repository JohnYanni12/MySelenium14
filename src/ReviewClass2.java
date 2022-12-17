import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ReviewClass2 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        List<WebElement> radios = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        for (WebElement radio : radios) {
            String option = radio.getAttribute(("value"));
            if (option.equalsIgnoreCase("5 - 15")) {
                radio.click();

            }
            System.out.println(option);
        }
    }
    }

