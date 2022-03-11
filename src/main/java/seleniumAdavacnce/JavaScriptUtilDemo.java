package seleniumAdavacnce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptUtilDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		JavaScriptUtil js=new JavaScriptUtil(driver);
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By email=By.id("input-email");
		By pwd=By.id("input-password");
		
		WebElement emailid=driver.findElement(email);
		js.drawBorder(emailid);
		js.flash(emailid);
		emailid.sendKeys("Hello madhuri");
		
		WebElement pass=driver.findElement(pwd);
		js.drawBorder(pass);
		js.flash(pass);
		pass.sendKeys("Pass");
		
		js.scrollPageDown();
		
		
		
				
		

	}

}
