package FirstPackage_SimplePract;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestivedDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","//C:\\Users\\radia\\eclipse-workspace\\MyMavn1\\drivers\\Drivers\\chromedriver.exe");

		driver= new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List <WebElement> options=driver.findElements(By.cssSelector("ul[class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all'] a"));
		for(WebElement option: options)
		{
			if(option.getText().equalsIgnoreCase("india"))
			{
				option.click();
				break;// to stop abruptly without scanning the whole list
			}
			
		}
			
	}

}
