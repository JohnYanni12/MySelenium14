package WindoHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://accounts.google.com/signup");
        driver.manage().window().maximize();


        String gmailHandle = driver.getWindowHandle();
        System.out.println("The handle of the current page is: "+ gmailHandle);
        driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts?hl=en&p=account_iph']")).click();
        driver.findElement(By.xpath("//a[@href='https://accounts.google.com/TOS?loc=US&hl=en&privacy=true']")).click();





    }
}
