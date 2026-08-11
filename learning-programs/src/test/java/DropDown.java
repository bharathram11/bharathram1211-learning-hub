

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
//		Thread.sleep(3000);
//		//1.selectByVisibleText 2.selectByValue 3.selectByIndex
//		WebElement parentdrop=driver.findElement(By.xpath("//div[@class='information closable']//following-sibling::p/select"));
//		Select drop=new Select(parentdrop);
//		drop.selectByVisibleText("India");
		//drop.selectByValue("IND");
         // drop.selectByIndex(102);
		driver.get("https://formy-project.herokuapp.com/");

        // Wait for the dropdown button to be present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dropdownButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dropdownMenuButton")));

        // Interact with the parent button
        dropdownButton.click();

        // Use JavaScript to get the pseudo-element content
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            String content = (String) js.executeScript(
                "return window.getComputedStyle(document.querySelector('#dropdownMenuButton'), '::after').content;"
            );
            System.out.println("Pseudo-element content: " + content);
        } catch (Exception e) {
            System.out.println("Error accessing pseudo-element: " + e.getMessage());
        }
		List<WebElement>B=driver.findElements(By.xpath("//button[@id='dropdownMenuButton']/following::div/a"));
		for(WebElement a:B)
		{
			if(a.getText().equalsIgnoreCase("Dropdown"))
			{
				a.click();
			}
		}
		
	}

}
