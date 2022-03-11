package seleniumAdavacnce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WindowHandlerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String parentWindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		Set<String>handles=driver.getWindowHandles();
		ArrayList<String> winHandles=new ArrayList<String>(handles);
		
		Iterator<String> it=winHandles.iterator();
		
		while(it.hasNext())
		{
			String windowId=it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());
			if(!parentWindow.contains(windowId))
			{
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
	}

}
