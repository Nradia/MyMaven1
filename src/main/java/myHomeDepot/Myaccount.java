package myHomeDepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaccount {

	WebDriver driver;
	
	@FindBy(xpath="//div[text()='My Account']") WebElement myaccount;
	@FindBy(xpath="//*[text()='Register']")WebElement register;
	
	public Myaccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	public void myaccountClick() {
		myaccount.click();
	}
	
	public void registerClick() {
		register.click();
	}
}
