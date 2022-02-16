package seleniumAdavacnce;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownwithMultipleCheckbox {
  static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		By inputBox= By.xpath("//input[@id='justAnInputBox']");
		By choice=By.xpath("//span[@class='comboTreeItemTitle']");
		driver.findElement(inputBox).click();
		
		//tc 1: single selection
		//selectChoice(choice,"choice 2");
		
		//tc 2: Multiple selection
		//selectChoice(choice,"choice 2","choice 3");
		
		//tc 2: all selection
		selectChoice(choice,"all");
				
		

	}

	public static void selectChoice(By locator, String...value)
	{
		List<WebElement> choiceList=driver.findElements(locator);
		System.out.println(choiceList.size());
		//System.out.println(value);
		boolean flag=false;
		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement e : choiceList)
			{
				String text=e.getText();
				for(int i=0; i<value.length;i++)
				{
					if(text.equals(value[i]))
					{
						System.out.println(value[i]);
						e.click();
						flag=true;
						break;
					}
				}
			
			}
		}
		else //all selection
		{
			try{
					for(WebElement e : choiceList)
					{
						e.click();
						flag=true;
					}
				}
						
				catch(Exception ex) {
					System.out.println("all choces are over");
				}
		}
			
		
		if(flag==false)
		{
			System.out.println("Wrong choice input");
		}
			
			
		
	}

}
