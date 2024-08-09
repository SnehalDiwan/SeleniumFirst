import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Documents\\SnehalCoding\\Selenium\\SeleniumFirst\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(2000);
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
         Select s= new Select(month);
        //  s.selectByIndex(1);
        Thread.sleep(2000);
         s.selectByVisibleText("Oct");
         WebElement year=driver.findElement((By.xpath("//select[@id='year']")));
         Select s1= new Select(year);
         Thread.sleep(2000);
         s1.selectByValue("2023");
         driver.close();
    }
}
