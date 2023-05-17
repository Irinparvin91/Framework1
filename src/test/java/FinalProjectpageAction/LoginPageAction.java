package FinalProjectpageAction;

import FinalProjectpageLocator.LoginPageLocator;
import FinalUtility.FinalBase;

public class LoginPageAction extends FinalBase {
	LoginPageLocator loginPageLocator = new LoginPageLocator();
	
	public void userCard(String u,String p) {

		loginPageLocator.Username.sendKeys(u);	
		loginPageLocator.Password.sendKeys(p);
		loginPageLocator.LoginButton.click();
	
	}		


}