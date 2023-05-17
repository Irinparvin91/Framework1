package FinalProjectpageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FinalUtility.FinalBase;

public class ProfilePageLocator extends FinalBase{

	public 	ProfilePageLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Welcome Falgun']")
	public WebElement profile;
}
