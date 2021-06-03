package FirstPackage_SimplePract;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class setPropertyDriver {

	public static void main(String[] args) throws InterruptedException {
	
	// JUST CHECKIN THE UPDATE HAVE BEEN PUSHED SUUCESSFULU	
	//*************************************************************	
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\radia\\git\\repositoryRad\\Automation\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\radia\\git\\repositoryRad\\Automation\\Drivers\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://pbskids.org");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@alt='Pinkalicious Fairy House']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[style='touch-action: none; display: block; height: 490px; width: 980px; margin: 0px; cursor: inherit;']")).click();
		
		/*driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println("cutrrent url is"+driver.getCurrentUrl());
		Thread.sleep(1000);
		WebElement email=driver.findElement(By.xpath("//*[@id='email']")) ;    // (By.id("email"));
		email.sendKeys("Nora@gmail.com");
		Thread.sleep(1000);
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("258");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//*[@id='loginform']/div[2]/div[2]")).getText());
		WebElement forgotPW=driver.findElement(By.linkText("Forgot Password?"));
		forgotPW.click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();
		*/
		
	

	}
	
	
	}
