package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.user.HomePageUI;

public class UserRewardPointPageObject extends BasePage {

	private WebDriver driver;
	
	public UserRewardPointPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

}
