package seleniumAdavacnce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumBasics1.BrowserUtil;

public class ElementDisplay {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br =new BrowserUtil();
		driver=br.launchBrowser("chrome");
		br.enterURL("https://demo.opencart.com/index.php?route=account/login");
		By emailname=By.name("email");
		By Searchbox=By.xpath("//*[@name='search']");
		By para=By.xpath("(//div[@class='well']//p)[2]");
		
		//is displayed check visibility of element, it check element is visible or hidden
		ElementUtil ele=new ElementUtil(driver);
		if(ele.doisDisplay(Searchbox)) {
			System.out.println("Search Box is displayed");
			ele.doSendKeys(Searchbox, "hi");
		}
	// isenabled check element is visible and its enebled
		if (ele.doisEnabled(emailname)) {
			System.out.println("email field is enabled");
		}

	}

}
