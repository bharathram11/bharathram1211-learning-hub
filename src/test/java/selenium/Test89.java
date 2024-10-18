package selenium;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
public class Test89
{
	public static void main(String[] args) throws Exception
	{
		//open chrome browser
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//get default page source load timeout
		Duration d=driver.manage().timeouts().getPageLoadTimeout();
        System.out.println(d.getSeconds()); //300seconds
		//set page source load timeout
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000));
        //Launch site
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        //close site
        driver.quit();
	}
}
