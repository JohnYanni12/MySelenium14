import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        goto syntax project /dropDown demo
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
//        maximize
        driver.manage().window().maximize();

        WebElement simpleAlart = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlart.click();

        Thread.sleep(2000);
        Alert simpleAlart1 = driver.switchTo().alert();
        simpleAlart1.accept();


        WebElement ConfirmAlart = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        ConfirmAlart.click();

        Thread.sleep(2000);
        Alert simpleAlart2 = driver.switchTo().alert();
        simpleAlart2.dismiss();



        WebElement PromptFunction = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        PromptFunction.click();


        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("uasijpc");
        prompt.accept();

    }
}
