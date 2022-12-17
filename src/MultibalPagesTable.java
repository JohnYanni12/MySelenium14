import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultibalPagesTable {

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

        WebElement pinBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pinBtn.click();

        WebElement employeeListBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']"));
        employeeListBtn.click();



        boolean idFound = false;
        while(!idFound) {
            //        get all the ids from the columns
            List<WebElement> columnID = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
            for (int i = 0; i < columnID.size(); i++) {

//extract the id from the entry in list
                String id = columnID.get(i).getText();
//            check if it is the desired id
                if (id.equalsIgnoreCase("41903A")) {
//                check the checkbox associated with this particular  row
                    System.out.println("i have found the id on row number " + (i + 1));
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    idFound=true;
                    break;
                }

            }
            if (!idFound){
                WebElement nextButton = driver.findElement(By.xpath("//a[text()='Next']"));
                nextButton.click();
            }
        }
    }
}