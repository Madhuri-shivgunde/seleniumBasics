package seleniumAdavacnce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUpHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//https://the-internet.herokuapp.com/basic_auth
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String uname="admin";
		String pwd="admin";
		// to handle authenticatipn popup, we need to pass username and password in URL only, such kinde of scenarios are used logging with server
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://"+uname+":"+pwd+"@the-internet.herokuapp.com/basic_auth");
	}

}
