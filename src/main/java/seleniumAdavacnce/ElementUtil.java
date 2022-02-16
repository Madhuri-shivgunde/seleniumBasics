package seleniumAdavacnce;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil 
{
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) 
	{
		this.driver=driver;
	}
	
//************************************    getElement(By locator) finds a web element******************************
	public  WebElement getElement(By locator)
	{
		return driver.findElement(locator);
		
	}
	
//************************************    getElements(By locator) finds web elements ******************************
	
	public  List<WebElement> getElements(By locator) 
	{
		
		return driver.findElements(locator);
				
	}
	
	
// **************************************enterURL(String url) to hit url
public void enterURL(String url)
	{
		driver.get(url);
	}

//************************************    doGetURL() ******************************
	public  String doGetURL()
	{
		return driver.getCurrentUrl();
		
	}

//************************************    doGetTitle() ******************************
		public  String doGetTitle()
		{
			return driver.getTitle();
		}

//************************************   doSendKeys(By locator ,String value) calls getelement method to find webelement and inputs data to webelement ***********************

	public  void doSendKeys(By locator ,String value)
	{
		getElement(locator).sendKeys(value);
		
	}
	
//************************************    doSendKeys(String LocatorType, String LocatorValue, String value) calls getelement method to finds webelement and input data in it ****************
	public  void doSendKeys(String LocatorType, String LocatorValue, String value) 
	{
		getElement(getBy(LocatorType,LocatorValue)).sendKeys(value);
	}
	
//**************************************  	doActionSendKeys(By locator, String value)
	public  void doActionSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value);
	}
	
	
// ***************************************doClick(By Locator) calls getelement to find element and then clicks on it*************************************
	
	public  void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	
//******************************************    doActionClick(By locator)
	
	public  void doActionClick(By locator)
	{
			Actions act=new Actions(driver);
			act.click(getElement(locator)).perform();
	}
	
//************************************** doGetText(By locator) calls getElement to find element and returns text of element 
	public String doGetText(By locator)
	{
		return getElement(locator).getText();
	}
	

//********************************* doGetAttribute(By locator, String attrName)
	public String doGetAttribute(By locator, String attrName)
	{
		return getElement(locator).getAttribute(attrName);
	}
	
	
//********************************* doisDisplay(By locator)
	public boolean doisDisplay(By locator)
	{
		return getElement(locator).isDisplayed();
	}
		
//********************************* doisEnabled(By locator)
	public boolean doisEnabled(By locator)
	{
		return getElement(locator).isEnabled();
	}
	
 //************************************     getBy(String LocatorType, String LocatorValue)  gives By locator by prviding locator type **********************
	
	public By getBy(String LocatorType, String LocatorValue) 
	{
		By locator =null;
		switch (LocatorType) {
		case "id":
			locator=By.id(LocatorValue);
				
			break;
		case "name":
			locator=By.name(LocatorValue);
				
			break;
			
		case "class":
			locator=By.className(LocatorValue);
				
			break;
		case "xpath":
			locator=By.xpath(LocatorValue);
				
			break;
		case "cssSelector":
			locator=By.cssSelector(LocatorValue);
				
			break;
		default:
			break;
		}
		return locator;
	}
	
	
//************************************************  getElementsCount(By locator)  given total no of element

	public int getElementsCount(By locator) 
	{
		return getElements(locator).size();
	}
	
//**********************************************   printElementsAttribute(By locator,String attr)

public  void printElementsAttribute(By locator,String attr) 
	{
		List<WebElement> eleList=getElements(locator);
		for(WebElement e: eleList) 
		{
			String att =e.getAttribute(attr);
			System.out.println(" : "+att);
			
		}
	}

//***********************************************   List<String> getElementsAttributeList(By locator, String attr)
public  List<String> getElementsAttributeList(By locator, String attr)
{
	List<WebElement> eleList=getElements(locator);
	List<String> attri_List = new ArrayList<String>();
	for(WebElement e: eleList) 
	{
		String text=e.getAttribute(attr);
		
		if(!attr.isEmpty()) 
		{
			attri_List.add(text);
		}
	}
	return attri_List;
}



//*************************************************  printElementsText(By locator)
public void printElementsText(By locator) 
{
	List<WebElement> eleList=getElements(locator);
	int count=0;
	for(WebElement e: eleList) {
		String text=e.getText();
		//String href =e.getAttribute("href");
		if(!text.isEmpty()) {
			System.out.print(count+" : "+text);
			//System.out.println(" : "+href);
		}
		count++;
		}

}

//***********************************************   List<String> getElementsTextList(By locator)
public  List<String> getElementsTextList(By locator)
{
	List<WebElement> eleList=getElements(locator);
	List<String> textList = new ArrayList<String>();
	for(WebElement e: eleList) 
	{
		String text=e.getText();
		//String href =e.getAttribute("href");
		if(!text.isEmpty()) 
		{
			textList.add(text);
			//System.out.println(" : "+href);
		}
	}
	return textList;
}

//***********************************************************  clickOnLinks(By locator,String lonkText)
	public  void clickOnLinks(By locator,String linkText) 
	{
		
		List<WebElement> eleList=getElements(locator);
		
		for(WebElement e: eleList) 
		{
			String text=e.getText();
			if(text.equals(linkText))
			{
				e.click();
				break;
			}
			
		}
	
}

//************************************************************ dropdown utils *******************************************

public  void doSelectDropdownByIndex(By locator, int index)
{
	Select ele=new Select(getElement(locator));
	ele.selectByIndex(index);
}

public  void doSelectDropdownByVisibleText(By locator, String visibleText)
{
	Select ele=new Select(getElement(locator));
	ele.selectByVisibleText(visibleText);
}
public  void doSelectDropdownByValue(By locator, String value)
{
	Select ele=new Select(getElement(locator));
	ele.selectByVisibleText(value);
}

public int getDropdownOptiosCount(By locator)
{
	 Select options=new Select(getElement(locator));
	 return options.getOptions().size();
	 
	//return getDropdownAllOptionsList(locator).size();
}

public  List<String> getDropdownAllOptionsList(By locator)
{
	Select alloptions=new Select(getElement(locator));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	List<WebElement>allElementList=alloptions.getOptions();
	List<String> allOptionsTextList=new ArrayList<String>();
	int c=0;
	for(WebElement e : allElementList)
	{
		String option=e.getText();
		//System.out.println(option);
		allOptionsTextList.add(c+":"+option);
		c++;
	
		
	}
	return allOptionsTextList;
}

public  void selectValuefromDropdownOptions(By locator, String value)
{
	Select alloptions=new Select(getElement(locator));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	List<WebElement>allElementList=alloptions.getOptions();
	
	for(WebElement e : allElementList)
	{
		String option=e.getText();
		if(option.equals(value))
		{
			e.click();
			break;
		}
	
	}

}

//********************************************************************* Wait methods for element and Non Element

public  WebElement waitForElementToBePresent(By locator, long timeout)
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
}
public  List<WebElement> waitForAllElementToBePresent(By locator, long timeout)
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
	return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
}
public  WebElement waitForElementToBeVisible(By locator, long timeout)
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
	return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
}
public  List<WebElement> waitForAllElementToBeVisible(By locator, long timeout)
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
	return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
}
public  Boolean waitFotTitleContains(String title, long timeout) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
	return wait.until(ExpectedConditions.titleContains(title));
}
public  Boolean waitFotURLFractionContains(String urlFraction, long timeout) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
	return wait.until(ExpectedConditions.urlContains(urlFraction));
}

}
