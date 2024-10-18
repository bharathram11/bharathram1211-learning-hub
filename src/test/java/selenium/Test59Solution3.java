package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test59Solution3
{
	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.goindigo.in/"); 
		Thread.sleep(10000);
		//Select round trip
		driver.findElement(By.xpath("//span[@aria-label='multiCity']")).click();
		Thread.sleep(5000);
		//Collect all radio buttons
		List<WebElement> neighbors=driver.findElements(By.xpath("//span[@role='radio']"));
		System.out.println(neighbors.size());
		//Get selected radio button's neighbor span
        for(WebElement neighbor:neighbors) {
            if (neighbor.isDisplayed()) {
                // Check if the radio button is selected
                String script = "var elem = arguments[0];" +
                                "var after = window.getComputedStyle(elem,'::after');" +
                                "return(after.getPropertyValue('opacity'));";
                JavascriptExecutor js = (JavascriptExecutor) driver;
                String opacity = (String) js.executeScript(script, neighbor);
                // If opacity is 1, the radio button is selected
                if ("1".equals(opacity)) 
                {
                    // Get aria-label of the selected radio button's neighbor span
                    String ariaLabel = neighbor.getAttribute("aria-label");
                    System.out.println("Selected radio button aria-label: " + ariaLabel);
                }
            }
        }
		//Close site
		driver.quit();
	}
}
