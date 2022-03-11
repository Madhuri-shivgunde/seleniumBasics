package seleniumAdavacnce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class StaleElementExample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		By footerList=By.xpath("(//div[@class='col-sm-6']/ul)[1]//a");
		List<WebElement> List_footerEle=driver.findElements(footerList);
		for(int i=0;i<List_footerEle.size();i++)
		{
			List_footerEle.get(i).click();
			//Thread.sleep(1000);
			System.out.println(driver.getTitle());
			driver.navigate().back();
			
			// here we need to reinitialize List_footerEle to get rid of StaleElementReference Exception
			List_footerEle=driver.findElements(footerList);
		}

	}

}
