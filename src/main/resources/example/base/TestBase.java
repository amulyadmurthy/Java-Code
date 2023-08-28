package org.example.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.Config;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

//public class TestBase {

/*
public WebDriver driver;
public static Properties config = new Properties();
public Properties or= new Properties();
public FileInputStream fis;
@BeforeSuite
public void setUp() throws FileNotFoundException {

    if ((config.getProperty("browser").equals("chrome")))
    {
        WebDriverManager.chromedriver().setup();
    } else if (config.getProperty("browser").equals("firefox")) {
        WebDriverManager.firefoxdriver().setup();


        
    }

    driver.get(config.getProperty("testsiteurl"));
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty())
}

   @AfterSuite
   public void tearDown()
    {
        if(driver!== null) {
            driver.quit();
        }
    }
}
*/