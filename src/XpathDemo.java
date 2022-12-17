import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jo_mrmr@yahoo.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("[J0hnAdams]");
        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();

        //input[@id='pass']
    }
}
