package homeDepMentoring;

import org.testng.annotations.Test;

public class HdepoCreate extends UsabilityM {
  @Test
  public void f() {
	  
	  
	  MyAccountM my=new MyAccountM(driver);
	  SelectContM  se=new SelectContM (driver);
	  CreateAccountM cr=new CreateAccountM(driver);
	  

	  my.myAccountClick();
	  my.registerClick();
	  se.selctContClick();
	  cr.emailField("johnsilver@gmail.com");
	  cr.pwField("abc#$133");
	  cr.zipField("12365");
	  cr.phoneField("7033333333");
	  cr.creatButton();
	  
	  
  }
}
