package seleniumAdavacnce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumBasics1.BrowserUtil;

public class RegistrationPageTest {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br =new BrowserUtil();
		driver=br.launchBrowser("chrome");
		br.enterURL("https://demo.opencart.com/index.php?route=account/login");
		By regi=By.xpath("(//div[@class='list-group']/a)[2]");
		By fn=By.id("input-firstname");
		By ln=By.id("input-lastname");
		By email=By.id("input-email");
		By tele=By.id("input-telephone");
		By pwd=By.name("password");
		By cpwd=By.xpath("//input[@name='confirm']");
		By rbYes=By.xpath("(//*[@class='radio-inline']//input)[1]");
		By chk=By.xpath("//*[@type='checkbox']");
		By submitbtn=By.xpath("//*[@type='submit']");
		By heading= By.xpath("//div[@id='content']//h1");
		
		ElementUtil ele=new ElementUtil(driver);
		ele.doClick(regi);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(fn));
		ele.doSendKeys(fn, "Madhuri");
		ele.doSendKeys(ln, "Shivgunde");
		ele.doSendKeys(email, "madhuri.shivgunde08@gmail.com");
		ele.doSendKeys(tele,"1234567890");
		ele.doSendKeys(pwd, "Madhu@123");
		ele.doSendKeys(cpwd, "Madhu@123");
		ele.doClick(rbYes);
		ele.doClick(chk);
		ele.doClick(submitbtn);
		
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(heading));
		System.out.println(ele.doGetText(heading));
		
		
		
		
		
	}

}
