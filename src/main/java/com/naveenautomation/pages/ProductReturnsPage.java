package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.base.TestBase;

public class ProductReturnsPage extends TestBase {

	public ProductReturnsPage() {
		PageFactory.initElements(wd, this);
	}

	/* Locating the elements */

	@FindBy(css = "#content>p")
	WebElement returnProductMessage;

	@FindBy(css = "a.btn-primary")
	WebElement continueBtn;

	/* Method to return the text from return page */
	public String getMessageForProductReturn() {
		return returnProductMessage.getText();
	}

	public AccountPage clickContinueBtn() {
		continueBtn.click();
		return new AccountPage();
	}

}
