import java.io.InterruptedIOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.Select;


public class SauceDemo {
    public static void main(String[] args) throws InterruptedException{
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Documents\\SnehalCoding\\Selenium\\SeleniumFirst\\chromedriver.exeull");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Documents\\SnehalCoding\\Selenium\\SeleniumFirst\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(3000);
       WebElement dropdown= driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select s= new Select(dropdown);
        
        s.selectByIndex(2);
        Thread.sleep(2000);
        String expText="Sauce Labs Bike Light";
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='inventory_item_label']/a"));
        for(WebElement item : list){
            String actText=item.getText();
            if(actText.startsWith(expText)){
                System.out.println("came here");
                item.click();

            }
            // System.out.println(item.getText());
        }
     
      

        driver.close();
    }

}
