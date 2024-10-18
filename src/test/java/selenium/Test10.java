package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Test10 {

	public static void main(String[] args) {
		
		//way-2 of opening a firefox driver
		WebDriver driver=new FirefoxDriver();
		driver.close();
	}

}

