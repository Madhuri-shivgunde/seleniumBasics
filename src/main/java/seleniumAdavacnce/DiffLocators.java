package seleniumAdavacnce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumBasics1.BrowserUtil;

public class DiffLocators {
	static WebDriver driver;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		BrowserUtil br =new BrowserUtil();
		driver=br.launchBrowser("chrome");
		br.enterURL("https://demo.opencart.com/index.php?route=account/login");
		
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();

		//driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		
		// 1. id (attribute) : id value is unique attribute for web element, if id is specified for element then use id to locate element
		
		// 2. name (attribute): name value can be duplicate 
		
		// 3. class(attribute): class name is not preffered as it may be duplicated 
		
		/* 4. xpath: xpath is not attribute of html tag
		         it is address of html element
		        there is syntax to create custome xpath   
		        		//tagname[@attribute='value']
		        		//*[@attribute='value'] 
		    
		 */
		
		
		/* 5.  cssSelector:  cssSelector is not attribute of html tag
        it is address of html element
       there is syntax to create custome  cssSelector
       		tagname[attribute='value']
       		*[attribute='value'] 
       		#idvalue
       		.classname
   
		 */
		
		// 6. linkText: only for links <a>, it takes whole linked text
		
		// 7. partialLink Text : only for links <a>, but it takes only part of linked text
		
		// 8. tagname
		
		By emailname=By.name("email");
		By pwdname=By.name("password");
		By btnLogin=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		By regLink=By.linkText("Register");
		By forgot_pwdLink=By.partialLinkText("Forgotten");
		By heading= By.tagName("h2");
		
		//*************************  calling action methods defined from Element Util class
		
		ElementUtil ele=new ElementUtil(driver);
		
		// enter data in email field
		ele.doSendKeys(emailname, "madhuri@gmail.com");
		
		//enter data in password field
		ele.doSendKeys(pwdname, "Madhuri2123");
		
	    // click action on login button
		//ele.doClick(btnLogin);
		
		
		//click on link 'Register'
		//ele.doClick(regLink);
		
		
		//click on link forgotten password
		//ele.doClick(forgot_pwdLink);
		
		
		// capturing text of webelement
		
		String text=ele.doGetText(heading);
		System.out.println(text);
		
		//getting value entered in email input
		
		String value=ele.doGetAttribute(emailname, "value");
		System.out.println(value);
		
		
	}
	
	
	
	//************************************    getElement(By locator) finds a web element******************************
		public  static WebElement getElement(By locator)
		{
			return driver.findElement(locator);
		}
		
		
	//************************************   doSendKeys(By locator ,String value) calls getelement method to find webelement and inputs data to webelement ***********************

		public  static void doSendKeys(By locator ,String value)
		{
			getElement(locator).sendKeys(value);
			
		}
		
	//************************************    doSendKeys(String LocatorType, String LocatorValue, String value) calls getelement method to finds webelement and input data in it ****************
		public static void doSendKeys(String LocatorType, String LocatorValue, String value) 
		{
			getElement(getBy(LocatorType,LocatorValue)).sendKeys(value);
		}
		
	// ***************************************doClick(By Locator) calls getelement to find element and then clicks on it*************************************
		
		public  static void doClick(By locator)
		{
			getElement(locator).click();
		}
		
		
	//************************************** doGetText(By locator) calls getElement to find element and returns text of element 
		public static String doGetText(By locator)
		{
			return getElement(locator).getText();
		}
		
	//********************************* 
		public String doGetAttribute(By locator, String attrName)
		{
			return getElement(locator).getAttribute(attrName);
		}
		//************************************     getBy(String LocatorType, String LocatorValue)  gives By locator by prviding locator type **********************
		
		public static By getBy(String LocatorType, String LocatorValue) 
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
		

}
