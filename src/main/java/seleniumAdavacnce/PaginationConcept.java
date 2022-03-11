package seleniumAdavacnce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationConcept {
	 static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,3000)");
		
		
		//WebElement next=driver.findElement(By.cssSelector("a.paginate_button.next"));
		
		int pageCount=0;
		while(true)
		{
			if(driver.findElements(By.xpath("//td[text()='LA']")).size()>0)
			{
				selectCity("LA");
				System.out.println("Found on Page: "+pageCount);
				break;
			}
			else
			{
				//pagination logic
				WebElement next=driver.findElement(By.cssSelector("a.paginate_button.next"));
				if(next.getAttribute("class").contains("disabled"))  //paginate_button next disabled
				{
					System.out.println("Pagination is Over....city not found");
					break;
				}
				next.click();
				Thread.sleep(1000);
				pageCount++;
			}
		}
		
		
		
		
	}
	
	public static void selectCity(String name)
	{
		WebElement eleCity=driver.findElement(By.xpath("//td[text()='"+name+"']"));
		driver.findElement(with(By.xpath("//input[@type='checkbox']")).toLeftOf(eleCity)).click();
	}

}
