package FinalProjectpageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FinalUtility.FinalBase;

public class HomePageLocator extends FinalBase{

public 	HomePageLocator() {
	PageFactory.initElements(driver, this);
}

@FindBy(id="login2")
public WebElement loginLink; 
}
