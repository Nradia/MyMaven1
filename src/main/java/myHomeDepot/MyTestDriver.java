package myHomeDepot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTestDriver {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","//C:\\Users\\radia\\eclipse-workspace\\MyMavn1\\drivers\\Drivers\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("https://homedepot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement MyAccount=driver.findElement(By.xpath("//div[text()='My Account']"));
		MyAccount.click();
		
		WebElement register=driver.findElement(By.xpath("//*[text()='Register']"));
		register.click();
		WebElement select=driver.findElement(By.xpath("//*[text()='Select & Continue']"));
		select.click();
		WebElement emailfield=driver.findElement(By.id("email"));
		emailfield.sendKeys("radia@yahoo.com");
		
		WebElement pwfield=driver.findElement(By.id("password-input-field"));
		pwfield.sendKeys("8754lkj");
		
		WebElement zipfield=driver.findElement(By.id("zipCode"));
		zipfield.sendKeys("55555");
		WebElement phonefield=driver.findElement(By.id("phone"));
		phonefield.sendKeys("100258795");
		//*[@class='rc-anchor-pt']
		
		WebElement captcha=driver.findElement(By.xpath("//*[@class='rc-anchor-pt']"));
		captcha.click();
	}

}
