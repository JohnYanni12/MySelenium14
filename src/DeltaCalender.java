import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DeltaCalender {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("https://www.delta.com");

//       click on the calander
                WebElement calander=driver.findElement(By.xpath("//span[text()='Depart']"));
        calander.click();

//         get the month and check if it is the desried month
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        WebElement nxtBtn = driver.findElement(By.xpath("//span[text()='Next']"));

        boolean isFound=false;
        while(!isFound){
            String monthName = month.getText();
                if(monthName.equalsIgnoreCase("December")){
    //               get all the dates from the table
                    List<WebElement> dates = driver.findElements(By.xpath("(//table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
    //               traverse through the list to find your desried date
                        for(WebElement date:dates){
                            String currentDay = date.getText();
                            if(currentDay.equalsIgnoreCase("15")){
                                date.click();
                            break;
                    }
                }
                System.out.println("I have found the desried date  :" +  monthName);
                isFound=true;
            }
            else{
                nxtBtn.click();
            }
        }
    }
}