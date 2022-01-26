package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;
    public WebDriver initDriver(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/webdriver/chromedriver.exe");
         driver =new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.MINUTES);
        wait=new WebDriverWait(driver,20);
        return driver;
    }



}
