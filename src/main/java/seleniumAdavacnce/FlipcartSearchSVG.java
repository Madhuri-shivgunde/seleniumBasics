package seleniumAdavacnce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipcartSearchSVG {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//  (//*[local-name()='svg']/*[name()='g' and @fill-rule='evenodd']/*[name()='path'])[2]
		//  (//*[local-name()='svg']/*[name()='g' and @fill-rule='evenodd']/*[name()='path'])[2]
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Watch");
		driver.findElement(By.xpath("(//*[local-name()='svg']/*[name()='g' and @fill-rule='evenodd']/*[name()='path'])[2]")).click();
	}

}
