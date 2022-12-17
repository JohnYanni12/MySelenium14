import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Syntax {

    /*Navigate to http://syntaxprojects.com/
Click on start practicing        //a[@herf='#']
click on simple form demo
enter any text on first text box
click on show message
quit the browser  */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(2000);
      //  driver.findElement(By.linkText("basic-first-form-demo.php")).click();
        driver.findElement(By.className("list-group-item[1]")).click();

    }
}
