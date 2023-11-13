package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.base.TestBase;

public class NewsLetterSubscriptionPage extends TestBase {

	public NewsLetterSubscriptionPage() {
		PageFactory.initElements(wd, this);
	}

	/* Locating the elements */

	@FindBy(css = "label.radio-inline:first-of-type>input")
	WebElement yesRadioBtn;

	@FindBy(css = "input.btn-primary")
	WebElement continueBtn;

	public void clickYesOnRadioBtn() {
		yesRadioBtn.click();
	}

	public AccountPage clickSubmitBtn() {
		clickYesOnRadioBtn();
		continueBtn.click();
		return new AccountPage();
	}

}
