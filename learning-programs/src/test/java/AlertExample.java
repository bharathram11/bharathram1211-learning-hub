import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;

public class AlertExample {

    public static void main(String[] args) {
        //WebDriver driver = new ChromeDriver();
       // WebDriver driver1 = new EdgeDriver();
        WebDriver driver2 = new FirefoxDriver();
        driver2.get("https://omayo.blogspot.com/");
        driver2.manage().window().maximize();

  
        driver2.findElement(By.xpath("//input[@id='prompt']")).click();

        Alert alert=driver2.switchTo().alert();
        alert.sendKeys("Hello");
        System.out.println(alert.getText());
        
    }
}
