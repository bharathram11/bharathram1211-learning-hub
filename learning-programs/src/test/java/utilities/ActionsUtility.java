package utilities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public final class ActionsUtility
{
	//Constructor
	private ActionsUtility()
	{
	}
	//Operational methods
	public static void clickOnElementCenter(WebElement e, Actions act, FluentWait<WebDriver> wait)
	{
		wait.until(ExpectedConditions.elementToBeClickable(e));
		act.click(e).perform(); //similar to click() in WebElement interface
	}
	
	public static void rightClickOnElementCenter(WebElement e, Actions act, FluentWait<WebDriver> wait)
	{
		wait.until(ExpectedConditions.elementToBeClickable(e));
		act.contextClick(e).perform();
	}
	
	public static void doubleClickOnElementCenter(WebElement e, Actions act, FluentWait<WebDriver> wait)
	{
		wait.until(ExpectedConditions.elementToBeClickable(e));
		act.doubleClick(e).perform();
	}
	
	public static void clickOnElementAtLocation(WebElement e, int xoffset, int yoffset, Actions act, FluentWait<WebDriver> wait)
	{
		wait.until(ExpectedConditions.elementToBeClickable(e));
		act.moveToElement(e).pause(Duration.ofSeconds(3)).moveByOffset(xoffset, yoffset)
		                          .pause(Duration.ofSeconds(3)).click().build().perform();
	}
	
	public static void clickOnPageAtLocation(int xCoord, int yCoord, Actions act, FluentWait<WebDriver> wait)
	{
		act.moveByOffset(xCoord, yCoord).pause(Duration.ofSeconds(3)).click().build().perform();
		//move from 0,0 to x,y
	}
	
	public static void fillElement(WebElement e, String data, Actions act, FluentWait<WebDriver> wait)
	{
		wait.until(ExpectedConditions.elementToBeClickable(e));
		act.sendKeys(e,data).perform(); //similar to sendKeys() in WebElement interface
	}
	
	public static void mouseClickAndHoldOnElement(WebElement e, Actions act, FluentWait<WebDriver> wait)
	{
		act.clickAndHold(e).pause(500).perform();
	}
	
	public static void mouseReleaseOnElement(WebElement e, Actions act, FluentWait<WebDriver> wait)
	{
		act.release(e).perform();
	}
	
	public static void keyBoardKeyStrokeOnElement(WebElement e, CharSequence k, Actions act, FluentWait<WebDriver> wait)
	{
		act.keyUp(k).pause(500).perform();
		act.keyDown(k).perform();
	}
	
	public static void scrollFullPageDown(Actions act)
	{
		act.sendKeys(Keys.END).perform();
	}
	
	public static void scrollFullPageUp(Actions act)
	{
		act.sendKeys(Keys.HOME).perform();
	}
	
	public static void scrollToPageLocation(int xCoord, int yCoord, Actions act)
	{
		act.scrollByAmount(xCoord, yCoord).perform();
	}
	
	public static void scrollToGetElementVisible(WebElement e, Actions act, FluentWait<WebDriver> wait)
	{
		act.scrollToElement(e).perform(); //get into bottom of the viewport
	}
	
	public static void scrollFromElement(WebElement e, int xoffset, int yoffset, Actions act, FluentWait<WebDriver> wait)
	{
		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(e);
		act.scrollFromOrigin(scrollOrigin, xoffset, yoffset).perform();
	}
	
	public static void scrollRightInElement(WebDriver driver, WebElement e, Actions act, FluentWait<WebDriver> wait)
	{
		//get element into top of the viewport
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",e);
		for(int i=1;i<=10;i++)
		{
			act.sendKeys(e,Keys.ARROW_RIGHT).perform();
		}
	}
	
	public static void scrollLeftInElement(WebDriver driver, WebElement e, Actions act, FluentWait<WebDriver> wait)
	{
		//get element into top of the viewport
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",e);
		for(int i=1;i<=10;i++)
		{
			act.sendKeys(e,Keys.ARROW_LEFT).perform();
		}
	}
	
	public static void scrollDownInElement(WebDriver driver, WebElement e, Actions act, FluentWait<WebDriver> wait)
	{
		//get element into top of the viewport
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",e);
		act.sendKeys(e,Keys.END).perform();
	}
	
	public static void scrollUpInElement(WebDriver driver, WebElement e, Actions act, FluentWait<WebDriver> wait)
	{
		//get element into top of the viewport
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",e);
		act.sendKeys(e,Keys.HOME).perform();
	}
		
	public static void scrollToElementInElement(WebDriver driver, WebElement outer, WebElement inner, Actions act, FluentWait<WebDriver> wait)
	{
		//get element into top of the viewport
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",outer);
		act.moveToElement(outer).pause(Duration.ofSeconds(3)).moveToElement(inner).perform();
	}
	
	public static void focusOnElementCenter(WebElement e, Actions act, FluentWait<WebDriver> wait)
	{
		wait.until(ExpectedConditions.elementToBeClickable(e));
		act.moveToElement(e).perform();
	}
	
	public static void focusOnElementLocation(WebElement e, int xoffset, int yoffset, Actions act, FluentWait<WebDriver> wait)
	{
		wait.until(ExpectedConditions.elementToBeClickable(e));
		act.moveToElement(e).moveByOffset(xoffset, yoffset).build().perform();
	}
	
	public static void dragDrop(WebDriver driver, WebElement e1, WebElement e2, Actions act, FluentWait<WebDriver> wait)
	{
		wait.until(ExpectedConditions.visibilityOf(e1));
		wait.until(ExpectedConditions.visibilityOf(e2));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",e1);
		act.dragAndDrop(e1,e2).perform();
	}
	
	public static void moveSlider(WebDriver driver, WebElement e, int xoffset, int yoffset, Actions act, FluentWait<WebDriver> wait)
	{
		wait.until(ExpectedConditions.visibilityOf(e));
		act.moveToElement(e).pause(500).dragAndDropBy(e,xoffset,yoffset).perform(); 
	}
	
	public static String getStaticToolTipText(WebElement e, Actions act, FluentWait<WebDriver> wait)
	{
		//tool-tip is value of "title" attribute of an element
		wait.until(ExpectedConditions.visibilityOf(e));
		String temp=e.getAttribute("title");
		if(temp==null)
			temp=e.getAttribute("aria-label");
		return(temp);
	}
	
	public static String getDynamicToolTipText(WebElement e, Actions act, FluentWait<WebDriver> wait)
	{
		//tool-tip is child span of target element
		wait.until(ExpectedConditions.visibilityOf(e));
		act.moveToElement(e).pause(5000).clickAndHold(e).pause(5000).build().perform();
		WebElement tt=e.findElement(By.xpath("child::span"));
		String temp=tt.getText();
		act.release(e).perform();
		return(temp);
	}
}
