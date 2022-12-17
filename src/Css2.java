import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));

//        boolean displayStatus = maleRadioBtn.isDisplayed();
//        System.out.println("The radio button is Displayed :" + displayStatus);
//
//        boolean enabledStatus = maleRadioBtn.isEnabled();
//        System.out.println("The radio button is Displayed :" + enabledStatus);
//
//        boolean selectedStatus = maleRadioBtn.isSelected();
//        System.out.println("The radio button is Displayed :" + selectedStatus);
//        if (!selectedStatus) {
//            maleRadioBtn.click();
//        }
//        selectedStatus = maleRadioBtn.isSelected();
//        System.out.println("The radio button is Displayed :" + selectedStatus);
        WebElement btn = driver.findElement(By.cssSelector("button#buttoncheck"));
        String text = btn.getText();
        System.out.println(text);
    }

}
