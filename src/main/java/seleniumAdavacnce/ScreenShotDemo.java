package seleniumAdavacnce;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		WebElement imgele=driver.findElement(By.xpath("//img[@class='logo logo-fworks ']"));
		
		
		takeScreenShotOfPage(driver);
		driver.navigate().refresh();
	 imgele=driver.findElement(By.xpath("//img[@class='logo logo-fworks ']"));
		takeScreenShotOfElement(imgele);
		
		
		
		
	}
	public static void takeScreenShotOfPage(WebDriver driver)  {
		
			//create TakesScreenshot interface reference and cast driver object of type TakesScreenshot i.e. convert driver to Takesscreenshot
				TakesScreenshot shot=(TakesScreenshot)driver;
				
				
			//caall getScreenshotAs() method . it will take screenshot and stores as image file type in memory
				File srcShotfile=shot.getScreenshotAs(OutputType.FILE);
				
			//Move image file to new destination file
				Random ranNum=new Random();
				int num=ranNum.nextInt(50);
				System.out.println(num);
				String name="./screenShot"+num+".png";
				 File destShotfile=new File(name);
				 
				//Copy file at destination
				 
				 try {
					FileUtils.copyFile(srcShotfile, destShotfile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}
	
	public static void takeScreenShotOfElement(WebElement ele)
	{
		
		File srcEleFile=ele.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcEleFile, new File("./Ele.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
