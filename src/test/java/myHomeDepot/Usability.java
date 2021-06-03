package myHomeDepot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
 
public class Usability {
	
	WebDriver driver;
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","//C:\\Users\\radia\\eclipse-workspace\\MyMavn1\\drivers\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://homedepot.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	 driver.close(); 
  }

}
