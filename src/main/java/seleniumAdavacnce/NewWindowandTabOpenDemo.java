package seleniumAdavacnce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowandTabOpenDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testproject.io/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		
		 //open new tab
		
		WebDriver newdriver=openNewTab(driver);
		newdriver.get("https://www.freshworks.com/");
		System.out.println(newdriver.getTitle());
		
		//open new Window
		WebDriver newWindowdriver=openNewWindow(driver);
		newWindowdriver.get("https://www.google.com/");
		System.out.println(newWindowdriver.getTitle());
		

	}
	public static WebDriver openNewTab(WebDriver driver)
	{
		return(driver.switchTo().newWindow(WindowType.TAB));
		
	}
	public static WebDriver openNewWindow(WebDriver driver)
	{
		return driver.switchTo().newWindow(WindowType.WINDOW);
		
	}


}
