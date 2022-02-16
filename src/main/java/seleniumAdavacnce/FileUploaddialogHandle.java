package seleniumAdavacnce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploaddialogHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		By chosefilebtn=By.xpath("//input[@name='upfile']");
		driver.findElement(chosefilebtn).sendKeys("D:\\Anish Stuff\\Vedic\\asd.png");
		// to upload file html tag should be <input type=file>
	}

}
