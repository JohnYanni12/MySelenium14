package WindoHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Calender {

    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.navigate().to("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement userBtn = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userBtn.sendKeys("admin");

        WebElement passwordBtn = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        passwordBtn.sendKeys("Hum@nhrm123");

        WebElement SubmitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        SubmitBtn.click();

        WebElement recruitmentBtn = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitmentBtn.click();


        //a[@id='menu_recruitment_viewRecruitmentModule']
    }
}
