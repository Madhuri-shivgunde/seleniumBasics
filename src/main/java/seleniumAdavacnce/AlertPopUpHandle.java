package seleniumAdavacnce;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) {
		
		//Alert popup or modal dialog popup is Javascript based popup which selenium driver can not handle directlty
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		By submit=By.xpath("//input[@name='proceed']");
		driver.findElement(submit).click();
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();						// getting msg displayed in alert
		System.out.println("message in alert is: "+msg);
		alert.accept();									// clicking on ok
		//alert.dismiss();
		//alert.sendKeys("Hi");   						 //alert which contains textinput takes user input
		
		
	}

}
