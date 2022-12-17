import Pages.LoginPage;
import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class RightClick extends CommonMethods {

    public static void main(String[] args) {
       /* goto https://demo.guru99.com/test/simple_context_menu.html
        right click  on the button, select edit and handle the alert
        double click on the button and handle the alert*/

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
//      create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//      maximize
        driver.manage().window().maximize();
//       go to the website
        driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");

        WebElement RighrBut = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions actions = new Actions(driver);
        actions.contextClick(RighrBut).perform();
        WebElement editBtn = driver.findElement(By.xpath("//span[text()='Edit']"));
        editBtn.click();
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        WebElement doubleClickBtn = driver.findElement(By.xpath(("//button[text()='Double-Click Me To See Alert']")));
        Actions actions1 = new Actions(driver);
        actions1.doubleClick(doubleClickBtn).perform();
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();


    }
}
