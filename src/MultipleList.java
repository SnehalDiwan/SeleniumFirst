import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleList {
    public static void main(String[] args) throws InterruptedException{
        
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Documents\\SnehalCoding\\Selenium\\SeleniumFirst\\chromedriver.exe");
      WebDriver driver= new ChromeDriver();
      driver.get("https://www.facebook.com/");
  List<WebElement> list= driver.findElements(By.xpath("//ul[contains(@class,'localeSelectorList')]/li"));
       String expText="English";
       for(WebElement item:list){
      String actualText= item.getText();
        if(actualText.equals(expText)){
            item.click();
            break;
        }
       }
    //    list.get(2).click();
       Thread.sleep(2000);
      


       driver.close();
        
    }
}
