package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test11 {

	public static void main(String[] args) {
		
		//way-3 of opening a firefox driver
		RemoteWebDriver driver=new FirefoxDriver();
		driver.close();
	}

}
