import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopUp {
    public static void main(String[] args) throws InterruptedException{
         
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Documents\\SnehalCoding\\Selenium\\SeleniumFirst\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.get("https://www.flipkart.com/");
        // driver.manage().window().maximize();
        // driver.findElement(By.xpath("//span[@role='button']")).click();
        // driver.close();
        driver.get(("https://demoqa.com/alertsWindows"));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[3]/span/div/div[1]/text()]")).click();
        Thread.sleep(2000);
        
        // JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("window.scrollIntoView(document.body.scrollHeight)", "");
            
       
        // driver.findElement(By.xpath("")).click();
        // Thread.sleep(2000);
    }
    
}
