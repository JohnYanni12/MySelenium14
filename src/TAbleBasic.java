import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TAbleBasic {


    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.get("  https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();

        WebElement allTable = driver.findElement(By.xpath("//table [@id='customers']"));
        String Text = allTable.getText();
      //  System.out.println(Text);

        //        print all the rows of the table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row : rows) {
            String rowText = row.getText();
//            System.out.println(rowText);
//            System.out.println("-----------------");


            if(rowText.contains("Google")){
                System.out.println(rowText);
            }
        }

        //        print all the individual columns of the table
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement column:columns){
            String columntext = column.getText();
            System.out.println(columntext);
            System.out.println("-----------------");
        }
    }
}