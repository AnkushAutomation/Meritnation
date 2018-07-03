package pages;

import org.openqa.selenium.WebDriver;

import core.ActionDriver;
import pageElements.UserPageElements;

public class UserPage extends ActionDriver {

	public UserPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyUser(String UserName) {
		return textIsEqualTo(UserPageElements.displayName, UserName);
	}

}
