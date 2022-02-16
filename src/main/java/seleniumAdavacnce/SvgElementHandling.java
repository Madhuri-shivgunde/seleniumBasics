package seleniumAdavacnce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
  SVG(Scalar Vector Graph): 
  -To locate svg element normal xpath will not work.
  -Need to use two functions
  	local-name()='svg'
  	name()='g'
  	name='path'
  	
  	
  	Html svg tag
  	<svg id="map1">
  		<g id="graph1">
  					<path id="p1">
  		</g>
  		
  		<g id="graph2">
  			<path id="p2">
  		</g>
  		
  	</svg>
  
 * 
 * */

public class SvgElementHandling {

		static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		// //*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='features']/*[name()='g']/*[name()='g']/*[name()='path']
		List<WebElement>svgStates=driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='features']/*[name()='g']/*[name()='g']/*[name()='path']"));
		
		Actions act=new Actions(driver);
		for(WebElement e: svgStates)
		{
			act.moveToElement(e).perform();
			Thread.sleep(500);
			String statename=e.getAttribute("name");
			System.out.println(statename);
			if(statename.equalsIgnoreCase("Washington"))
			{
				e.click();
				break;
			}
		}
		
		
	}

}
