package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.base.TestBase;

public class LogoutPage extends TestBase {

	public LogoutPage() {
		PageFactory.initElements(wd, this);
	}

	/* Locating the elements */

	@FindBy(css = "a.btn-primary")
	WebElement submitBtn;

	@FindBy(css = "#content>h1")
	WebElement logoutSuccessMessage;

	/* Method to return the success message from logout page */
	public String getSuccessMessageForLogout() {
		return logoutSuccessMessage.getText();
	}

	public HomePage clickContinueBtn() {
		submitBtn.click();
		return new HomePage();
	}
}
