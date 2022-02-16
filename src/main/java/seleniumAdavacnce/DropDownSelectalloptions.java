package seleniumAdavacnce;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
	
public class DropDownSelectalloptions {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country=By.xpath("//select[@id='Form_submitForm_Country']");
		By state= By.id("Form_submitForm_State");
		System.out.println(getDropdownAllOptionsList(country));
		selectValuefromDropdownOptions(country,"India");
		wait.until(ExpectedConditions.visibilityOfElementLocated(state));
		selectValuefromDropdownOptions(state,"Maharashtra");
		
//		Select allCountry=new Select(driver.findElement(country));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(country));
//		List<WebElement>allCountryElementList=allCountry.getOptions();
//		List<String> allCountryTextList=new ArrayList<String>();
//		for(WebElement e : allCountryElementList)
//		{
//			String option=e.getText();
//			//System.out.println(option);
//			allCountryTextList.add(option);
//		
//			
//		}
//		System.out.println(allCountryTextList);
		
	}
	public static List<String> getDropdownAllOptionsList(By locator)
	{
		Select alloptions=new Select(driver.findElement(locator));
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

	
	public static int getDropdownOptiosCount(By locator)
	{
		 Select options=new Select(driver.findElement(locator));
		 return options.getOptions().size();
		 
		//return getDropdownAllOptionsList(locator).size();
	}
	
	
	public static void selectValuefromDropdownOptions(By locator, String value)
	{
		Select alloptions=new Select(driver.findElement(locator));
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
	
	
}
