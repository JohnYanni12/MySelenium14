import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropDownDemo {

    public static void main(String[] args) throws InterruptedException {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        goto syntax project /dropDown demo
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
//        maximize
        driver.manage().window().maximize();

//        find the WebElement dropDwon by looking for select tag
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='select-demo']"));

//        use Select class
        Select select = new Select(dropDown);

//        select an option by index
        select.selectByIndex(5);
        Thread.sleep(3000);
//        select by visible Text
        select.selectByVisibleText("Saturday");
        Thread.sleep(3000);
//     select by value
        select.selectByValue("Sunday");
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            WebElement option = options.get(i);
            String text = option.getText();
            if(text.equalsIgnoreCase("Monday"));
            select.selectByIndex(i);

       }
   }
}

