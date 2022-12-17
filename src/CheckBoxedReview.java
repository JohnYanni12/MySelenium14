import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class CheckBoxedReview {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");

        List<WebElement> colors = driver.findElements(By.xpath("//input[@name='color']"));

        for (WebElement color: colors) {
            String col = color.getAttribute("value");
            if (col.equalsIgnoreCase("orange")){
                color.click();
                break;

            }
            System.out.println(col);


        }


    }
}
