package projectsUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownElm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","//C:\\Users\\radia\\eclipse-workspace\\MyMavn1\\drivers\\Drivers\\chromedriver.exe");

		driver= new ChromeDriver();
		
		
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.get("https://expedia.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@data-stid='location-field-destination-menu-trigger']")).sendKeys("Algeria");
		driver.findElement(By.xpath("(//*[@data-day='12'])[1]")).click();
		
		/*WebElement currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(currency);
		dropdown.selectByVisibleText("INR");
		Thread.sleep(2000);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("USD");
		Thread.sleep(2000);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByIndex(2);
		Thread.sleep(2000);
		System.out.println(dropdown.getFirstSelectedOption().getText());*/
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		for(int i=0; i<6;i++)
			{driver.findElement(By.id("hrefIncAdt")).click();}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Thread.sleep(2000);
		driver.findElement(By.id("btnclosepaxoption")).click();;
	}

}//
