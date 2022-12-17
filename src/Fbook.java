import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Fbook {
    /*
    https://www.facebook.com/
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Yanni");
        driver.findElement(By.name("reg_email__")).sendKeys("jY@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123456tre");
//        driver.findElement(By.name("birthday_month")).sendKeys("Sep");
//        driver.findElement(By.name("birthday_day")).sendKeys("30");
//        driver.findElement(By.name("birthday_year")).sendKeys("2000");
        Thread.sleep(1000);
        //driver.findElement(By.xpath     ("u_2_5_b5")).click();

        WebElement months = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select sel = new Select(months);

        sel.selectByIndex(4);
        List<WebElement> option = sel.getOptions();
        for (WebElement options:
        option) {
            String month = options.getAttribute("");
            System.out.println(month);
        }


        WebElement day =  driver.findElement(By.xpath("//select[@id='day']"));
        Select sell = new Select(day);
        sell.selectByValue("19");

      WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
      Select se = new Select(year);
      se.selectByVisibleText("2002");

      driver.findElement(By.xpath("//input[@value='2']")).click();
      driver.findElement(By.xpath("//button[@name='websubmit']")).click();
    }
}