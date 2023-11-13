package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.base.TestBase;

public class WishListPage extends TestBase {
	public WishListPage() {
		PageFactory.initElements(wd, this);
	}

	/* Locating the elements */
	@FindBy(css = "#content>p")
	WebElement wishListMessage;

	@FindBy(css = "a.btn-primary")
	WebElement continueBtn;

	/* Method to return the success text of wishList */
	public String getMessageForWishList() {
		return wishListMessage.getText();
	}

	public AccountPage clickContinueBtn() {
		continueBtn.click();
		return new AccountPage();
	}

}
