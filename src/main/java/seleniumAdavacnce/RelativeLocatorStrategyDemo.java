package seleniumAdavacnce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorStrategyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selenium 4 feature
		//Introduced following relative Locator Techniques to locate elements
		//1. toRightOf()
		//2. toLeftOf()
		//3. above()
		//4. below()
		//5. near()
		
		//so above functions can be used with with() functions
		//e.g. driver.findelement(with(By.tagname("p")).toRightOf(fname))
		//here fname is WebElement which is already loacated
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/india");
		WebElement city=driver.findElement(By.linkText("Mumbai, India"));
		System.out.println(city.getText());
		String aqi=driver.findElement(with(By.tagName("p")).toRightOf(city)).getText();
		System.out.println(aqi);
		String rank=driver.findElement(with(By.tagName("p")).toLeftOf(city)).getText();
		System.out.println(rank);
		
		List<WebElement> allaboveEle=driver.findElements(with(By.tagName("p")).above(city));
		for(WebElement e: allaboveEle)
		{
			System.out.println(e.getText());
		}
			
		
		

	}

}
