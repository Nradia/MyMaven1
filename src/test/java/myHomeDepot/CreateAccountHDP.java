package myHomeDepot;

import org.testng.annotations.Test;

public class CreateAccountHDP extends Usability {
  @Test
  public void createMethods() {
	  
	  Myaccount acc=new Myaccount(driver);
	  SelectCont sel=new SelectCont(driver);
	  CreatePage cre=new CreatePage(driver);
	  
	  acc.myaccountClick();
	  acc.registerClick();
	  sel.selectContClick();
	  cre.emailField("nora@gmail.com");
	  cre.pwlField("asd25896");
	  cre.zipcodeField("33309");
	  cre.phoneField("7039986325");
	  cre.captcha();
	  
  }
}
