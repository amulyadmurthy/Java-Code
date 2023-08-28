package InterviewPrep.list;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;




import static java.time.Duration.*;

public class Substring {

    @Test
    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);


        driver.get("https://www.selenium.dev/selenium/web/web-form.htm");
        driver.manage().window().maximize();
         //driver.manage().timeouts().implicitlyWait(ofSeconds(10));

        String title= driver.getTitle();
        title.length();
      WebElement textBox = driver.findElement(By.name("my-text"));
      textBox.sendKeys("Selenium");
      WebElement submitButton = driver.findElement(By.cssSelector("button"));
      submitButton.click();


    }
    }

