
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/datepicker");
		driver.manage().window().maximize();
		
		//by using sendkeys if it accept manually
      /*WebElement ele=driver.findElement(By.xpath("//input[@id='datepicker']"));
		ele.clear();
		ele.sendKeys("03/12/2024");*/
		
//		WebElement ele=driver.findElement(By.xpath("//input[@id='datepicker']"));
//		ele.click();
//		WebElement mon=driver.findElement(By.xpath("(//*[@class='datepicker-switch'])[1]"));
//		while(true)
//		{
////			try
////			{
//		       if(mon.getText().equalsIgnoreCase("March 2025"))
//		       {
//			     ele.findElement(By.xpath("//td[@class='day'][normalize-space()='27']")).click();
//		       }
//		       else
//		       {
//			      mon.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")).click();
//		       }
////			}
//			catch(Exception ex)
//			{
//		       driver.findElement(By.xpath("//*"));
//			}
		//}
		driver.get("https://www.redbus.com/");
		WebElement boarding=driver.findElement(By.xpath("//input[@id='onward_cal']"));
		boarding.click();
		WebElement month=driver.findElement(By.xpath("(//div[@class='DatePicker__DoubleCalendar-sc-1x9sb82-2 dwWaPy']//div[@class='DayNavigator__IconBlock-sc-1tlckkc-2 eTppvw'])[2]"));
		while(true)
		{
			try
			{
			if(month.getText().contains("April"))
			{
				driver.findElement(By.xpath("//div[contains(@class,'DatePicker__DoubleCalendar')]//span[contains(@class,'CalendarDaysSpan-sc') and text()='27']")).click();
			}
			else
			{
				driver.findElement(By.xpath("//div[@id='next']//*[name()='svg']")).click();
			}
			}
			catch(Exception ex)
			{
				driver.findElement(By.xpath("//*"));
			}
			//driver.close();
		}
	}
}
