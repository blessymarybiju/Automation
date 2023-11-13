package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.base.TestBase;

public class ShoppingCartPage extends TestBase {

	public ShoppingCartPage() {
		PageFactory.initElements(wd, this);
	}

	/* Locating the elements */

	@FindBy(css = "#content>p")
	WebElement cartMessage;

	@FindBy(css = "a.btn-primary")
	WebElement continueBtn;

	/* Method to return the success text of Shopping Cart */
	public String getMessageForShoppingCartPage() {
		return cartMessage.getText();
	}

	public HomePage clickContinueBtn() {
		continueBtn.click();
		return new HomePage();
	}

}
