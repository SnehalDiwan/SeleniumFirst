import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Documents\\SnehalCoding\\Selenium\\SeleniumFirst\\chromedriver.exe");
        //driver.get("https://www.google.com");
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://www.flipkart.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        String title=driver.getTitle();
        System.out.println(title);
        
        String actTitle=driver.getTitle();
        String expTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        
        if(actTitle.equalsIgnoreCase(expTitle)){
            System.out.println("Navigate to current webpage");
        }else{
            System.out.println("navigated to wrong webpage");
        }
        
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.quit();











        driver.close();
    }
}
