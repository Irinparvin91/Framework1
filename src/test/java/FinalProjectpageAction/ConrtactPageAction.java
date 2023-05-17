package FinalProjectpageAction;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import FinalProjectpageLocator.ContractPageLocator;
import FinalUtility.FinalBase;
import FinalUtility.FinalTestData;

public class ConrtactPageAction extends FinalBase{

	ContractPageLocator contractPageLocator = new ContractPageLocator();	
	public void ClickContractlink () {
		contractPageLocator.Contractlink.click();	
}
public void EnterContractemail () {
	contractPageLocator.Contractemail.sendKeys(FinalTestData.ContractEmail);	
}
public void EnterContractname () {
	contractPageLocator.Contractname.sendKeys(FinalTestData.Contractname);
}
public void EnterContractmessage() {
	contractPageLocator.Contractmessage.sendKeys(FinalTestData.ContractMessage);	
}

public void ClickandSendContract()	{
		contractPageLocator.sendmessage.click();
}
public void UsercanContractbysendingmessage() throws Exception {
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	boolean ValidateContract = contractPageLocator.ContractmessageValidation.isDisplayed();
			
     Assert.assertTrue(ValidateContract);
}
}