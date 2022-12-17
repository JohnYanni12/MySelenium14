package WindoHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicidWaites {

    public static  void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://facebook.com");

        WebElement newAccountBut = driver.findElement(By.linkText("Create new account"));
        newAccountBut.click();

        WebElement CreatAccony = driver.findElement(By.xpath("//a[@input"));
        newAccountBut.click();
    }
}