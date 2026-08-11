package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.foundit.in/upload");
//		//driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@type='file']")).sendKeys("C:\\Users\\bhara\\OneDrive\\Desktop\\QAAutomation__Bharath2years4Months__Resume.pdf");
		
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.findElement(By.xpath("(//*[@type='file'])[1]")).sendKeys("C:\\Users\\bhara\\OneDrive\\Desktop\\Interviewbb.docx");
		//driver.findElement(By.xpath("(//*[@type='file'])[2]")).sendKeys("C:\\Users\\bhara\\OneDrive\\Desktop\\GIT.txt");
	
		
		driver.findElement(By.xpath("(//*[@type='file'])[2]")).sendKeys("C:\\Users\\bhara\\OneDrive\\Desktop\\GIT.txt");
		driver.findElement(By.xpath("(//*[@type='file'])[2]")).sendKeys("C:\\Users\\bhara\\OneDrive\\Desktop\\basava automation.docx");
		driver.findElement(By.xpath("(//*[@type='file'])[2]")).sendKeys("C:\\Users\\bhara\\OneDrive\\Desktop\\basava.java.docx");
		driver.findElement(By.xpath("(//*[@type='file'])[2]")).sendKeys("C:\\Users\\bhara\\OneDrive\\Desktop\\Data.xlsx");
		driver.findElement(By.xpath("(//*[@type='file'])[2]")).sendKeys("C:\\Users\\bhara\\OneDrive\\Desktop\\Job tracker1.xlsx");
		driver.findElement(By.xpath("(//*[@type='file'])[2]")).sendKeys("C:\\Users\\bhara\\OneDrive\\Desktop\\Lingopanda_assignment.xlsxby BHARATH.xlsx");
	}
}
