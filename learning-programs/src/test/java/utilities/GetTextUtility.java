package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public final class GetTextUtility 
{
	//In HTML, text means a value in between start tag and end tag of an element.
	//Use this method to get text of an element including text of all child elements if exists.
	public static String getTextOfElement(WebDriver driver, WebElement e)
	{
		String x;
		if(e.isDisplayed())
		{
			//visible element
			x=e.getText();
		}
		else
		{
			//hidden element
			x=(String)((JavascriptExecutor)driver).executeScript("return(arguments[0].textContent);",e);
		}
		return(x);
	}
	
	//In HTML, text means a value in between start tag and end tag of an element.
    //Use this method to get text of an element excluding text of all child elements if exists.
	public static String getTextOfElementExcludeChilds(WebDriver driver, WebElement e)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
        String x = (String) js.executeScript(
            "var element = arguments[0];" +
            "var childNodes = element.childNodes;" +
            "var text = '';" +
            "for (var i = 0; i < childNodes.length; i++) {" +
            "  if(childNodes[i].nodeType === Node.TEXT_NODE) {" +
            "    text = text + childNodes[i].textContent;" +
            "  }" +
            "}" +
            "return text;", e);
        return(x);
	}
	
	//In HTML, text means a value in between start tag and end tag of an element.
	//Use this method to get text of given line in an element when it has multiple lines.
	public static String getTextOfElementIncludeChilds(WebDriver driver, WebElement e, int lineindex)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String x = (String) js.executeScript(
			"var element = arguments[0];" +
			"var childNodes = element.childNodes;" +
			"var text = childNodes[arguments[1]].textContent;" +
			"return text;", e, lineindex);
		return(x);
	}	
}
