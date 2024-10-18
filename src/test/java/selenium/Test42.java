package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test42 
{
    public static void main(String[] args) 
    {
        // Open browser
        WebDriver driver = new ChromeDriver();
        //Launch Site
        driver.get("https://www.amazon.in"); 
        //Extract unique colors in "rgba" form
        Set<String> uniquecolors=new HashSet<String>();
        // 1. Get all elements on the page
        List<WebElement> allelements=driver.findElements(By.xpath("//*"));
        // 2. Goto each element and take "background-color" and "color"
        try
        {
        for(WebElement element:allelements) 
        {
            String backgroundColor=element.getCssValue("background-color");
            uniquecolors.add(backgroundColor);
            
            String color=element.getCssValue("color");
            uniquecolors.add(color);
        }
        }
        catch(Exception ex)
        {
        	driver.findElement(By.xpath("//*"));
        }
        // Print the colors
        System.out.println("Total count of used colors in web page is "+uniquecolors.size());
        for(String color:uniquecolors) {
            System.out.println(color);
        }
        // Close the browser
        driver.quit();
    }
}
