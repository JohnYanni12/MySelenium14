import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Admin");
        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();
        WebElement span= driver.findElement(By.xpath("//span[@id='spanMessage']"));

        String error = span.getText();
        if (error.equalsIgnoreCase("Invalid credentials")){
            System.out.println(" The correct massage is there ----> verified");
        }
        else{
            System.out.println(" The correct massage is NOT there");
        }

//        if(span.isDisplayed()){
//            System.out.println("There is a problem with the submition");
//        }
    }
}
