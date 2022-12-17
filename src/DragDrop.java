import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.TimeUnit;

public class DragDrop {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // maximize
        driver.manage().window().maximize();

        //  go to the website
        driver.navigate().to("https://jqueryui.com/droppable/");

        //Switch the foucs to the Iframe
        driver.switchTo().frame(0);
       WebElement draggable =  driver.findElement(By.xpath("//div[@id='draggable']"));
       WebElement droppable =  driver.findElement(By.xpath("//div[@id='droppable']"));
        Thread.sleep(2000);
        Actions action = new Actions (driver );
        action.dragAndDrop(draggable,droppable).perform();

        //Here is a longer way to do the same job.....
        // action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
        }
    }