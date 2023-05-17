package FinalProjectpageAction;

import org.testng.Assert;

import FinalProjectpageLocator.ProfilePageLocator;
import FinalUtility.FinalBase;

public class ProfilePageAction extends FinalBase {

	ProfilePageLocator 	profilePageLocator = new ProfilePageLocator();
public void VerifyuserloginSuccessfully	() {
	boolean profilevalidation = profilePageLocator.profile.isDisplayed();
	Assert.assertTrue(profilevalidation);
}
 
	
	
}
