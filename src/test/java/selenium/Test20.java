package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test20 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
        WebDriver driver=new ChromeDriver();
        //wait for few seconds
      	Thread.sleep(5000);
        //Get handle value of that browser window
        String x=driver.getWindowHandle();
        System.out.println(x);
	}
}

