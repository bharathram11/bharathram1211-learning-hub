

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import ru.yandex.qatools.ashot.AShot;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		//WebElement e=driver.findElement(By.xpath("//img[@alt='Google']"));
		SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss-SSS");
		Date dt=new Date();
		String filename=sf.format(dt)+".png";
		AShot as=new AShot();
		File sourcefile=((TakesScreenshot) as).getScreenshotAs(OutputType.FILE);
		File targetFile = new File("target\\"+filename);	
		FileHandler.copy(sourcefile, targetFile);
	}
}
