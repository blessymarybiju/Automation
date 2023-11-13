package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.base.TestBase;

public class Transactions extends TestBase {

	public Transactions() {
		PageFactory.initElements(wd, this);
	}

	/* Locating the elements */
	@FindBy(css = "#content>p")
	WebElement currentBalanceMessage;

	@FindBy(css = "a.btn-primary")
	WebElement continueBtn;

	/* Method to return the success text of Transactions */
	public String getMessageForTransactions() {
		return currentBalanceMessage.getText();
	}

	public AccountPage clickContinueBtn() {
		continueBtn.click();
		return new AccountPage();
	}

}
