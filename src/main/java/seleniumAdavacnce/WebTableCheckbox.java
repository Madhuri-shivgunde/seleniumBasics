package seleniumAdavacnce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCheckbox {
	
		static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://selectorshub.com/xpath-practice-page/");
			
			////a[text()='Jordan.Mathews']/parent::td/preceding-sibling::td/child::input
			selectEmp("Jordan.Mathews");
			selectEmp("Garry.White");
	}
	
	public static void selectEmp(String name)
	{
		WebElement checkEmp=driver.findElement(By.xpath("//a[text()='"+name+"']/parent::td/preceding-sibling::td/child::input"));
		checkEmp.click();
	}

}
