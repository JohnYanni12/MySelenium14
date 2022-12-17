
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.id("email")).sendKeys("jo_mrmr@yahoo.com");
        driver.findElement(By.name("pass")).sendKeys("[J0hnAdams]");
        driver.findElement(By.name("login")).click();


    }
}