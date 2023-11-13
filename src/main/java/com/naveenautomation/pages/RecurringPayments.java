package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.base.TestBase;

public class RecurringPayments extends TestBase {

	public RecurringPayments() {
		PageFactory.initElements(wd, this);
	}

	/* Locating the elements */
	@FindBy(css = "#content>p")
	WebElement recurringPaymentMessage;

	@FindBy(css = "a.btn-primary")
	WebElement continueBtn;

	/* Method to return the text from payment */
	public String getMessageForPaymentsPage() {
		return recurringPaymentMessage.getText();
	}

	public AccountPage clickContinueBtn() {
		continueBtn.click();
		return new AccountPage();
	}

}
