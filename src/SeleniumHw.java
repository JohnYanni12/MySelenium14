import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class SeleniumHw {

    public static void main(String[] args) {
       /* go to https://the-internet.herokuapp.com/dynamic_controls
        click on checkbox and click on remove
        verify the text
        click on enable verify the textbox is enabled
        enter text and click disable
        verify the textbox is disabled*/

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        WebElement checkRemove = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        checkRemove.click();

        WebElement textMessage1 = driver.findElement(By.xpath("//p[@id='message']"));
        if(textMessage1.isDisplayed()){
            String massage1 = textMessage1.getText();
            System.out.println("The first massage is :"+ massage1);
            System.out.println("THe textbox is enabled: " +  textMessage1.isEnabled());

            WebElement enableBtn = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
            enableBtn.click();

            WebElement textMessage2 = driver.findElement(By.xpath("//p[@id='message']"));
            if(textMessage2.isDisplayed()) {
                String massage2 = textMessage2.getText();
                System.out.println("The second massage is :"+massage2);
            }
            WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
            text.sendKeys("I like Selenium");

            WebElement disableBtn = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
            disableBtn.click();

            WebElement CheckBox2 = driver.findElement(By.xpath("//input[@type='text']"));
            System.out.println(CheckBox2.isEnabled());
        }
    }
}


/*
public class waitReview {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

//        maximize
        driver.manage().window().maximize();
//        open the url
        driver.get("https://the-internet.herokuapp.com/dynamic_controls%22");
//        check the check the checkBox

//        implicit wait
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        WebElement checkBox = driver.findElement(By.xpath(" //input[@type='checkbox']"));
        checkBox.click();

//        click the button
        WebElement button = driver.findElement(By.xpath("//button[text()='Remove']"));
        button.click();

//        get the text
        WebElement text = driver.findElement(By.xpath("//p[text()="It's gone!"]"));
        System.out.println(text.getText());

//   click on the button
        WebElement buton2 = driver.findElement(By.xpath("//button[text()='Enable']"));
        buton2.click();

//        explicit

        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));

//        send text
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abracadabra");
    }
}*/
