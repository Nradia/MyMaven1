package myHomeDepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectCont {
WebDriver driver;
	@FindBy(xpath="//*[text()='Select & Continue']") WebElement selectCont;
public SelectCont(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void selectContClick() {
	selectCont.click();
}
}



