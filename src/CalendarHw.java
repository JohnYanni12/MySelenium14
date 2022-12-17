import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarHw {

        public static void main (String[]args) throws InterruptedException {
        /*Go to syntax hrms .
        Go-to the recruitment tab.
        From the calendar  just select a date
        8 August 2023*/

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

        WebElement CandidatesBtn = driver.findElement(By.xpath("//a[text()='Candidates']"));
        CandidatesBtn.click();

        WebElement calenderBtn = driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[1]"));
        calenderBtn.click();

        WebElement monthBtn = driver.findElement(By.xpath(" //select[@class='ui-datepicker-month']"));

        Select select = new Select(monthBtn);
        select.selectByValue("7");

        WebElement yearBtn = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1 = new Select(yearBtn);
        select1.selectByValue("2023");

        WebElement clickBtn = driver.findElement(By.xpath("//a[text()='8']"));
        clickBtn.click();
    }
}