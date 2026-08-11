import java.nio.file.spi.FileSystemProvider;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Abhi {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Click on "From Station" field
//        driver.findElement(By.xpath("//span[normalize-space()='Login/SignUp']")).click();
//        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("6303384734");
//        driver.findElement(By.xpath("//input[@placeholder='Enter Referral Code if Available']")).sendKeys("REFER");
//        driver.findElement(By.xpath("//button[@class='btn btn-login filled primary md inactive button']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(" "))

        // Wait for suggestions to load and locate the dropdown list items
        WebElement e=driver.findElement(By.xpath("//input[@placeholder='From Station']"));
        e.click();
//        WebElement e1=driver.findElement(By.xpath("//div[contains(@class,'auto-complete-drop-down')]//div[text()='Chennai']"));
//        e1.click();
        List<WebElement> allStations = driver.findElements(By.xpath("//div[contains(@class,'auto-complete-drop-down ')]//div[@class=' col']"));
        for(WebElement source:allStations)
        	{
        	if(source.getText().equals("Chennai"))
        	{
        		source.click();
        		break;
        	}
        	}
        driver.findElement(By.xpath("//input[@placeholder='To Station']")).click();
        	List<WebElement> allstation = driver.findElements(By.xpath("//div[contains(@class,'auto-complete-drop-down')]//div[@class=' col']"));

            for (WebElement destination : allstation) {
                if (destination.getText().equals("Goa")) {
                	destination.click(); // Click on the matching station
                    break; // Exit the loop after clicking
                }
        }
            driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
            WebElement name=driver.findElement(By.xpath("//div[@class='container calendar  ']//div[@class=' col']"));
            //name.getText();
            System.out.println(name.getText());
            while(true)
            {
              if(name.getText().equals("January 2025"))
              {
            	driver.findElement(By.xpath("(//div[@class='container date ']//span[text()='1'])[1]")).click();
               }
             else
              {
            	driver.findElement(By.xpath("//span[@class='calender-month-change']//*[name()='svg']")).click();
               }
            }
           

        // Close the browser
        //driver.quit();
    }
    }
