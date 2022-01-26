package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LaunchGoogle extends BasePage{



    private By searchBox=By.xpath("//input[@title='Search']");


    public void LaunchGoogle(String url,String searchInput){
      driver =initDriver();
      driver.get(url);
    }

    public void searchGivenText(String text){
      WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
      webElement.sendKeys(text);
      webElement.sendKeys(Keys.ENTER);
    }

   public void navigateToLink(int LinkNumber,String text) throws InterruptedException {
       List<WebElement> elements=driver.findElements(By.xpath("//h3"));
       elements.get(LinkNumber).click();
       Thread.sleep(6000);
       driver.quit();
   }


}
