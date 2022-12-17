import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelectDemo {

    public static void main(String[] args) throws InterruptedException {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        goto syntax project /dropDown demo
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
//        maximize
        driver.manage().window().maximize();
       WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));

       Select sel =new Select(DD);
       sel.selectByIndex(4);
        Thread.sleep(2000);
        sel.selectByVisibleText("Texas");
        Thread.sleep(2000);
        List<WebElement> options = sel.getOptions();

        for (int i = 0; i < options.size() ; i++){
            sel.selectByIndex(i);
            Thread.sleep(2000);
            sel.deselectAll();
//            String str = sel.toString();
//            System.out.println(str);
        }
    }
}