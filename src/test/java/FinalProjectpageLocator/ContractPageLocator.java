package FinalProjectpageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FinalUtility.FinalBase;

public class ContractPageLocator extends FinalBase {

	public 	ContractPageLocator() {
		PageFactory.initElements(driver, this);
	}
   @FindBy(xpath ="//a[text()='Contact']")
	public WebElement Contractlink; 	
   @FindBy(id="recipient-email")
   public WebElement Contractemail;
   @FindBy(id="recipient-name")
   public WebElement Contractname; 
   @FindBy(id="message-text")
   public WebElement Contractmessage;
   @FindBy(id="cat")
   public WebElement ContractmessageValidation; 
   @FindBy(xpath ="//button[text()='Send message']")
   	public WebElement sendmessage; 
}
