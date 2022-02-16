package seleniumAdavacnce;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountingElement {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		By anchor=By.tagName("a");
		By images=By.tagName("img");
		By footer_link=By.xpath("//div[@role='presentation']//ul/li/a");
		
		System.out.println("Total No of Fotter links: "+getElementsCount(footer_link));
		printElementsText(footer_link);
		
			clickOnLinks(footer_link,"Help");
		
		//ElementUtil ele=new ElementUtil(driver);
		//ele.enterURL("https://www.amazon.in/");
		
		
		/*
		 //total no. of links on page
		List<WebElement> links=driver.findElements(anchor);
		System.out.println("Total links: "+links.size());
		
		int fcount=getElementsCount(footer_link);
		System.out.println(fcount);
		
		*/
		
		/*
		 * System.out.println("Total No of Images: "+getElementsCount(images));
		
		System.out.println("Total No of links: "+getElementsCount(anchor));
		System.out.println("Total No of Fotter links: "+getElementsCount(footer_link));
		printElementsText(footer_link);
		printElementsAttribute(footer_link,"href");
	    printElementsText(anchor);
	     */
		
		
	   driver.navigate().to("https://www.google.com/");
	   By langlinks=By.xpath("//div[@id='SIvCob']/a");
	   printElementsText(langlinks);
	   
				
		
		//getting text of link and printing it
//		int count=0;
//		for(WebElement e: links) {
//			String text=e.getText();
//			String href =e.getAttribute("href");
//			if(!text.isEmpty()) {
//				System.out.print(count+" : "+text);
//				System.out.println(" : "+href);
//				
//			}
//			count++;
//			
//		}
		
//		//getting links of footer only
//		
//		List<WebElement> flinks=driver.findElements(footer_link);
//		System.out.println("Total links: "+flinks.size());
//		int count=0;
//		for(WebElement e: flinks) {
//			String text=e.getText();
//			String href =e.getAttribute("href");
//			if(!text.isEmpty()) {
//				System.out.print(count+" : "+text);
//				System.out.println(" : "+href);
//				
//			}
//			count++;
//			
//		}
		
	}
	
// ***********************************************************  List<WebElement> getElements(By locator) 
	public static List<WebElement> getElements(By locator) 
	{
		return driver.findElements(locator);
				
	}
	
// ***********************************************************  getElementsCount(By locator)
	public static int getElementsCount(By locator)
	{
		return getElements(locator).size();
		
	}

// ***********************************************************  printElementsAttribute(By locator,String attr) 
	public static void printElementsAttribute(By locator,String attr) 
	{
		List<WebElement> eleList=getElements(locator);
		for(WebElement e: eleList) 
		{
			String att =e.getAttribute(attr);
			System.out.println(" : "+att);
			
		}
	}
	
// ***********************************************************  printElementsText(By locator) 
	public static void printElementsText(By locator) 
	{
	
		List<WebElement> eleList=getElements(locator);
		int count=0;
		for(WebElement e: eleList) 
		{
			String text=e.getText();
			//String href =e.getAttribute("href");
			if(!text.isEmpty()) 
			{
				System.out.print(count+" : "+text);
				//System.out.println(" : "+href);
			}
			count++;
		}	
	
	}

// ***********************************************************  getElementsTextList(By locator)
	public static List<String> getElementsTextList(By locator)
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


// ***********************************************************  getElementsAttributeList(By locator, String attr)

	public static  List<String> getElementsAttributeList(By locator, String attr)
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



//***********************************************************  clickOnLinks(By locator,String lonkText)
	public static void clickOnLinks(By locator,String linkText) 
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
}


