package myHomeDepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePage {

WebDriver driver;
	
	@FindBy(id="email") WebElement emailField;
	@FindBy(id="password-input-field") WebElement pwlField;
	@FindBy(id="zipCode") WebElement zipcodeField;
	@FindBy(id="phone") WebElement phoneField;
	@FindBy(id="//*[@aria-labelledby='recaptcha-anchor-label']") WebElement captcha;

	
	public CreatePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void emailField(String email) {
		emailField.sendKeys(email);
	}
	
	
public void pwlField(String pw) {
	pwlField.sendKeys(pw);
	}
public void zipcodeField(String zipcode) {
	zipcodeField.sendKeys(zipcode);
	}
public void phoneField(String phone) {
	phoneField.sendKeys(phone);
	}
public void captcha() { 
	captcha.click();
	}
	}
