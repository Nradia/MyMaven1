package FirstPackage_SimplePract;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DreversTest {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","//C:\\Users\\radia\\eclipse-workspace\\MyMavn1\\drivers\\Drivers\\chromedriver.exe");

		driver= new ChromeDriver();
		
		
		/*driver.get("https://amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		//PAGE2
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("yanis@gmail.com");
		WebElement contin=driver.findElement(By.id("continue"));
		contin.click();
		//PAGE3
		WebElement pw=driver.findElement(By.id("ap_password"));
		pw.sendKeys("games");
		WebElement sign=driver.findElement(By.id("auth-signin-button"));
		sign.click();
		//a-list-item
		WebElement mesge=driver.findElement(By.className("a-list-item"));
		//class("aa-list-item"));
		System.out.println(mesge.getText());*/
		/*
		driver.get("https://homedepot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("headerMyAccount")).click(); 
		driver.findElement(By.xpath("(//*[text()='Register'])")).click();
		driver.findElement(By.xpath("(//*[text()='Select & Continue'])[1]")).click();
		driver.findElement(By.id("email")).sendKeys("Yanis@com");
		
		driver.findElement(By.id("password-input-field")).sendKeys("123");
		driver.findElement(By.id("zipCode")).sendKeys("22209");
		driver.findElement(By.id("phone")).sendKeys("1111111111");
		driver.findElement(By.xpath("(//*[text()='Create an Account'])[2]")).click();*/
	//="(//*[text()='Create an Account'])[2]") WebElement CreateButton;
		driver.get("https://expedia.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[text()='Flights'])[2]")).click();
		driver.findElement(By.xpath("//*[@aria-label='Leaving from']")).sendKeys("NYC");
		
		//driver.findElement(By.xpath("//*[@aria-label='Leaving from Newark (EWR - Liberty Intl.)']")).click();
		
		
	}

}
