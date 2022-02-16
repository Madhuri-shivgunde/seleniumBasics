package seleniumAdavacnce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int rowCount=getTableRowCount();
		int colCount=getTableColCount();
		int cellCount=getTableCellCount();
		System.out.println("Rows Count: "+rowCount);
		System.out.println("Column Count: "+colCount);
		System.out.println("Cell Count: "+cellCount);
		
		System.out.println(getCompanyName("Maria Anders"));
		System.out.println(getCountryName("Maria Anders"));

		
		System.out.println("Printing Row wise data");
		getRowWiseData();
		System.out.println("First Column data");
		getFirstColumnData();
		
		
		

	}
	
	public static String getCompanyName(String contactName)
	{
		
		//    //td[text()='Maria Anders']/following-sibling::td
		return driver.findElement(By.xpath("//td[text()='"+contactName+"']/preceding-sibling::td")).getText();
	}
	public static String getCountryName(String contactName)
	{
		
		//    //td[text()='Maria Anders']/following-sibling::td
		return driver.findElement(By.xpath("//td[text()='"+contactName+"']/following-sibling::td")).getText();
	}

	public static int getTableRowCount()
	{
		return driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size()-1;
	}
	
	public static int getTableColCount()
	{
		return driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
	
	}
	
	public static int getTableCellCount()
	{
		return (driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td")).size())+(driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size());
	
	}
	
	public static void getRowWiseData()
	{
		int rowNum=getTableRowCount();
		int colCount=getTableColCount();
		String startXpath="((//table[@id='customers']/tbody/tr)[";
		
		String endXpath="]/td)[";
		
		//        ((//table[@id='customers']/tbody/tr)[2])/td[1]
		//List<WebElement>allrow= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		for(int i=2;i<=rowNum+1;i++)
		{
			for(int j=1;j<=colCount;j++)
			{
				String xpath=startXpath+i+endXpath+j+"]";
				//System.out.println(xpath);
				String data=driver.findElement(By.xpath(xpath)).getText();
				System.out.print(data+"    ");
			}
			System.out.println();
		}
		
	}
	
	public static void getFirstColumnData()
	{
		int rowNum=getTableRowCount();
		int colCount=getTableColCount();
		String startXpath="((//table[@id='customers']/tbody/tr)[";
		String endXpath="]/td)[1]";
		
		//((//table[@id='customers']/tbody/tr)[2]/td)[1]
		//List<WebElement>allrow= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		for(int i=2;i<=rowNum+1;i++)
		{
			
				String xpath=startXpath+i+endXpath;
				//System.out.println(xpath);
				String data=driver.findElement(By.xpath(xpath)).getText();
				System.out.println(data+"    ");
			
		}
		
	}
	
}
