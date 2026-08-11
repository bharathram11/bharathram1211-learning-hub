package javascript;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless 
{
	public static void main(String[] args)
	{
		/*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("----headless=new");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.google.co.in");
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);*/
		
		/*ChromeOptions opt=new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://expired.badssl.com");
		String pg=driver.getTitle();
		System.out.println(pg);*///SSL handling your connection is not private msg to avoid that the above code is used
		
		/*ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.gmail.com");
		String pg=driver.getTitle();
		System.out.println(pg);*/ //to avoid chrome is being controlled by automated test software
		
		/*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.gmail.com");
		String pg=driver.getTitle();
		System.out.println(pg);*/
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--start-maximized");//maximize
		//opt.addArguments("--incognito");//icognito
        opt.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});//disable that message
        //opt.addArguments("--headless=new");//headless
        opt.setAcceptInsecureCerts(true);//ssl certificate
        File f=new File("C:\\Users\\bhara\\OneDrive\\Desktop\\testing\\TestCase-Studio-Chrome-Web-Store.crx");
        opt.addExtensions(f);
/*extensions adding and making enable download crx extractor  and add to chrome and go to required extension 
you need get crx file of that extensions go and search ectension and right click and download crx file and store it into a file
and do like above*/
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}
}
