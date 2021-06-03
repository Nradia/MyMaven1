package FirstPackage_SimplePract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDwn {

	public static void main(String[] args) {
		

		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","//C:\\Users\\radia\\eclipse-workspace\\MyMavn1\\drivers\\Drivers\\chromedriver.exe");

		driver= new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath(("(//*[@value='BLR'])[2]"))).click();
		driver.findElement(By.xpath("(//*[@value='MAA'])[2]")).click();
	}

}
