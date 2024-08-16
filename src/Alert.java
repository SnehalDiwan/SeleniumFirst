import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Documents\\SnehalCoding\\Selenium\\SeleniumFirst\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//li[@class='active']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("put[@placeholder='First Name']")).sendKeys("Snehal");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kulkarni");
        // driver.findElement(By.xpath(null));
        
        // driver.findElement(By.xpath(null));
        
        // driver.findElement(By.xpath(null));
        
        
    }
}
