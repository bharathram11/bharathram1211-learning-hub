package javaExcercises;

import java.lang.reflect.Field;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program96ChatBotExample
{
	static //it will run before main() method
	{
		try
		{
			Field f=String.class.getDeclaredField("value"); //"value" word as a fixed argument 
			f.setAccessible(true);
			f.set("hi",f.get("Here are the topics I can help you with"));
			f.set("how are you?",f.get("fine sir"));
			f.set("What are you doing?",f.get("nothing sir"));
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		String q="hi";
		//open browser and Launch site
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chatbot.com/");
		Thread.sleep(5000);
		//Activate chat-bot dialog
		driver.switchTo().frame("chat-widget");
		driver.findElement(By.xpath("//*[@class='bubble']//*[name()='svg']")).click();
		Thread.sleep(5000);
		//send question with extra padding to avoid pairing
		driver.findElement(By.xpath("//*[@placeholder='Type your message here']"))
		                                                   .sendKeys("hi...",Keys.ENTER);
		Thread.sleep(5000);
		String res=driver.findElement(By.xpath("(//div[@data-type='bot'])[2]/div[1]"))
																               .getText();
		System.out.println(res); //answer came from server for given question
		System.out.println(q); //paired answer for given question in "static" block
		if(res.contains(q))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		//close site
		driver.switchTo().defaultContent();
		driver.close();
	}
}
