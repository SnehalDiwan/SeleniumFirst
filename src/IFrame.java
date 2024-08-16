import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
    public static void main(String[] args) {
       
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Documents\\SnehalCoding\\Selenium\\SeleniumFirst\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        
        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.id("sampleHeading"));
        System.out.println(text.getText());

        WebElement heading = driver.findElement(By.xpath("//h1[@class='text-center']"));
        System.out.println(heading.getText());

        driver.quit();

    }
}
