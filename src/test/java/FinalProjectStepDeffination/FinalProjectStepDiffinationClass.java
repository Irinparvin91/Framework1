package FinalProjectStepDeffination;

import FinalProjectpageAction.HomePageAction;
import FinalProjectpageAction.LoginPageAction;
import FinalProjectpageAction.ProfilePageAction;
import FinalUtility.FinalBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FinalProjectStepDiffinationClass extends FinalBase {
	HomePageAction homePageAction =new HomePageAction ();
	LoginPageAction loginPageAction = new LoginPageAction ();
	ProfilePageAction profilePageAction = new ProfilePageAction ();
	
	@Given("^Open Demoblaze <\"([^\"]*)\"> Application$")
	public void open_Demoblaze_Application(String URL) throws Throwable {
		FinalProjectURL(URL) ;
	}

	@Then("^Click Login$")
	public void click_Login() throws Throwable {
		homePageAction.ClickLogin();  
	}

	@Then("^Enter username and password And Click Login(\\d+)$")
	public void enter_username_and_password_And_Click_Login(int arg1) throws Throwable {
		loginPageAction.userCard(wpro.getProperty("Username"),wpro.getProperty("Password")); 
	}

	@Then("^Verify user login Successfully$")
	public void verify_user_login_Successfully() throws Throwable {
	
		profilePageAction.VerifyuserloginSuccessfully(); 
	}



}
