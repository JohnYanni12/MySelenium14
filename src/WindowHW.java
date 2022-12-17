import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHW {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://accounts.google.com/signup");
        driver.manage().window().maximize();

        WebElement helpButton = driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts?hl=en&p=account_iph']"));
        helpButton.click();

        WebElement privicyButton = driver.findElement(By.xpath("//a[@href='https://accounts.google.com/TOS?loc=US&hl=en&privacy=true']"));
        privicyButton.click();

        Set<String> allHandles = driver.getWindowHandles();
//        driver.switchTo().window("Google Account Help");
        for(String handle : allHandles){
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")){
                System.out.println("The current page under focus is: "+ title);
                break;
            }
//            if (title.equalsIgnoreCase("Google Account Help")){
//                System.out.println("The current page under focus is: "+ title);
//                break;

        }


    }
}