import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Displayed {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        boolean result=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
        System.out.println(result);
        if(result==true){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }
        boolean results=driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
        System.out.println(results);
        if(results==true){
            System.out.println("element is enabled");
        }else{
            System.out.println("element is disabled");
        }

        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
         

        // boolean value=driver.findElement(By.xpath("//a[@id='u_0_0_zZ']")).isSelected();

        // System.out.println(value);
        // if(value==true){
        //     System.out.println("radio button is selected");
        // }else{
        //     System.out.println("not selected");
        // }

        driver.close();
    }
}
