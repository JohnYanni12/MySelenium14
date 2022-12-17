import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablePractise {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement userBtn = driver.findElement(By.cssSelector("input[name='txtUsername']"));
        userBtn.sendKeys("Admin");
        WebElement passBtn = driver.findElement(By.cssSelector("input[name='txtPassword']"));
        passBtn.sendKeys("Hum@nhrm123");
        WebElement loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
        loginbtn.click();
        //find the PIM button
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        //click on it
        pimBtn.click();
        //find the Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        //click on it
        employeeListBtn.click();


        int rowCount = 0;
        boolean notFound = true;
        while (notFound) {
            rowCount=0;
            List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

            for (WebElement id : idColumn) {
                String personID = id.getText();

                if (personID.equals("42188A")) {
                    System.out.println("Row number is: " + rowCount);
                    WebElement checkBtn = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (rowCount + 1) + "]/td[1]"));
                    checkBtn.click();
                    notFound = false;
                    break;
                }

                rowCount = rowCount + 1;
            }

            if (notFound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();

            }
        }
    }
}
