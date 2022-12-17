import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeameReview {
        public static void main(String[] args) {
            //       setting up the webDriver
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
//        create an instance
            WebDriver driver= new ChromeDriver();
//        open the demoqa Alerts
            driver.get("https://chercher.tech/practice/frames%22");

//        switch the focus of the driver to the parent iframe whose id is iframe1
                    driver.switchTo().frame("frame1");
//        switch the focus to the child frame
            driver.switchTo().frame(0);

            WebElement checkBox = driver.findElement(By.id("a"));
            checkBox.click();
}
}