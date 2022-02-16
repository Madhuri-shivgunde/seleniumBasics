package seleniumAdavacnce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelect {
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
		doSelectDropdownByIndex(country,20);
		doSelectDropdownByVisibleText(country,"India");
		wait.until(ExpectedConditions.visibilityOfElementLocated(state));
		doSelectDropdownByVisibleText(state,"Punjab");
		
//		Select country=new Select(driver.findElement(countrydrpdown));
//		country.selectByIndex(10);
//		country.selectByValue("India");
//		country.selectByVisibleText("Iceland");
		
		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doSelectDropdownByIndex(By locator, int index)
	{
		Select ele=new Select(getElement(locator));
		ele.selectByIndex(index);
	}
	
	public static void doSelectDropdownByVisibleText(By locator, String visibleText)
	{
		Select ele=new Select(getElement(locator));
		ele.selectByVisibleText(visibleText);
	}
	public static void doSelectDropdownByValue(By locator, String value)
	{
		Select ele=new Select(getElement(locator));
		ele.selectByVisibleText(value);
	}
}
