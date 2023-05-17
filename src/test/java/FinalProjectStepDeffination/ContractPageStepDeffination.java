package FinalProjectStepDeffination;

import FinalProjectpageAction.ConrtactPageAction;
import FinalUtility.FinalBase;
import cucumber.api.java.en.Then;

public class ContractPageStepDeffination extends FinalBase {
	ConrtactPageAction conrtactPageAction = new ConrtactPageAction();
		@Then("^Click Contract link$")
	public void click_Contract_link() throws Throwable {
			conrtactPageAction.ClickContractlink();   
	}

	@Then("^Enter Contract email$")
	public void enter_Contract_email() throws Throwable {
		conrtactPageAction.EnterContractemail();
	  	}

	@Then("^Enter Contract name$")
	public void enter_Contract_name() throws Throwable {
		conrtactPageAction.EnterContractname();   
	}

	@Then("^Enter Contract message$")
	public void enter_Contract_message() throws Throwable {
		conrtactPageAction.EnterContractmessage(); 
	}

	@Then("^Click and  Send Contract$")
	public void click_and_Send_Contract() throws Throwable {
		conrtactPageAction.ClickandSendContract();
	}

	@Then("^User can Contract by sending message$")
	public void user_can_Contract_by_sending_message() throws Throwable {
		conrtactPageAction.UsercanContractbysendingmessage(); 
	}


}
