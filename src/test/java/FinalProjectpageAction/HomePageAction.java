package FinalProjectpageAction;

import FinalProjectpageLocator.HomePageLocator;
import FinalUtility.FinalBase;

public class HomePageAction extends FinalBase {
	HomePageLocator homePageLocator = new HomePageLocator();
	public void ClickLogin() {
		homePageLocator.loginLink.click();	
	}
	public void clickNokiaPhone() {
		
	}
}
