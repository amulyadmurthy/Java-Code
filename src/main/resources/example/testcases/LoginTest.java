package example.testcases;

//import org.example.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void LoginBankManager() throws InterruptedException {
        driver.findElement(By.xpath(or.getProperty("bmlbtn")));
        Thread.sleep(3000);
    }
}
