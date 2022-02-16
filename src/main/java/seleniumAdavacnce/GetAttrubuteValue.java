package seleniumAdavacnce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumBasics1.BrowserUtil;

public class GetAttrubuteValue {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br =new BrowserUtil();
		driver=br.launchBrowser("chrome");
		br.enterURL("https://demo.opencart.com/index.php?route=account/login");
		By emailname=By.name("email");
		By Searchbox=By.xpath("//*[@name='search']");
		By para=By.xpath("(//div[@class='well']//p)[2]");
		ElementUtil ele=new ElementUtil(driver);
		
		
		String para1=ele.doGetText(para);
		System.out.println(para1);
		
		//
		System.out.println("Search InputBox: "+ele.doGetAttribute(Searchbox, "placeholder"));
		
		
		// enter data in email field
		ele.doSendKeys(emailname, "madhuri@gmail.com");
		String enteredtext=ele.doGetAttribute(emailname, "value");
		System.out.println("Text Entereed in email field: "+enteredtext);
		
		
	
		
		String placeholder=ele.doGetAttribute(emailname, "placeholder");
		System.out.println("Placeholder : s"+placeholder);
	}

}
