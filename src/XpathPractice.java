import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Documents\\SnehalCoding\\Selenium\\SeleniumFirst\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath(("//input[@id='email']"))).sendKeys("Snehal");
        driver.findElement(By.xpath(("//input[@id='pass']"))).sendKeys("pass@123");
        driver.findElement(By.xpath(("//button[@type='submit']"))).click();;
        driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
    }
}
