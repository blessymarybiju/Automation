package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.naveenautomation.base.TestBase;

public class AccountPage extends TestBase {

	public AccountPage() {
		PageFactory.initElements(wd, this);
	}

	/* Locating the elements */

	@FindBy(css = "#content>h2:first-of-type")
	WebElement myAccountText;

	@FindBy(css = "div.alert-success")
	WebElement acccountInfoUpdateSuccessMessage;

	@FindBy(css = "div.alert-success")
	WebElement passwordChangeSuccessMessage;

	@FindBy(css = "div.alert-success")
	WebElement newsLetterSubscribeSuccessMessage;

	@FindBy(css = "footer>div>div>div:nth-of-type(2)>ul>li:nth-of-type(1)>a")
	WebElement contactUsLink;

	@FindBy(css = "div#top-links>ul>li:nth-of-type(4)>a>span")
	WebElement shoppingCartLink;

	/* Method to return the text of the element 'myAccountText' */
	public String getMyAccountText() {
		return myAccountText.getText();
	}

	/* Method to return the success text of edit info */
	public String getSuccessMessageForEditInfo() {
		return acccountInfoUpdateSuccessMessage.getText();
	}

	/* Method to return the success text of password change */
	public String getSuccessMessageForPwdChange() {
		return passwordChangeSuccessMessage.getText();
	}

	/* Method to return the success text of newsletter */
	public String getSuccessMessageForNewsLetter() {
		return newsLetterSubscribeSuccessMessage.getText();
	}

	/* Method to click on editInfo link and to create an instance of EditPage' */
	public EditPage clickEditInfoLink() {
		SideNavigationBarOnPage.clickOnSideNavMenuLink("edit account");
		return new EditPage();
	}

	/*
	 * Method to click on cart link and to create an instance of Shopping cart Page'
	 */
	public ShoppingCartPage clickCartLink() {
		shoppingCartLink.click();
		return new ShoppingCartPage();
	}

	/*
	 * Method to click on downloads link and to create an instance of Downloads
	 * Page'
	 */
	public DownloadsPage clickDownloadLink() {
		SideNavigationBarOnPage.clickOnSideNavMenuLink("downloads");
		return new DownloadsPage();
	}

	/*
	 * Method to click on Payments link and to create an instance of payments Page'
	 */
	public RecurringPayments clickRecurringPaymentsLink() {
		SideNavigationBarOnPage.clickOnSideNavMenuLink("recurring payments");
		return new RecurringPayments();
	}

	/* Method to click on Contact link and to create an instance of Contact Page' */
	public ContactPage clickContactUsLink() {
		contactUsLink.click();
		return new ContactPage();
	}

	/*
	 * Method to click on Transactions link and to create an instance of
	 * Transactions Page'
	 */
	public Transactions clickTransactionsLink() {
		SideNavigationBarOnPage.clickOnSideNavMenuLink("transactions");
		return new Transactions();
	}

	/*
	 * Method to click on WishList link and to create an instance of WishListPage'
	 */
	public WishListPage clickWishListLink() {
		SideNavigationBarOnPage.clickOnSideNavMenuLink("wish list");
		return new WishListPage();
	}

	/*
	 * Method to click on ProductReturns link and to create an instance of
	 * ProductReturns Page'
	 */
	public ProductReturnsPage clickProductReturnLink() {
		
		SideNavigationBarOnPage.clickOnSideNavMenuLink("returns");
		return new ProductReturnsPage();
	}

	/*
	 * Method to click on ChangePassword link and to create an instance of
	 * ChangePassword Page'
	 */
	public ChangePasswordPage clickChangePwdLink() {
		SideNavigationBarOnPage.clickOnSideNavMenuLink("password");
		return new ChangePasswordPage();
	}

	/*
	 * Method to click on news letter subscription link and to create an instance of
	 * Subscription Page
	 */
	public NewsLetterSubscriptionPage clickNewsLetterLink() {
		SideNavigationBarOnPage.clickOnSideNavMenuLink("newsletter");
		return new NewsLetterSubscriptionPage();
	}

	/* Method to click on Logout link and to create an instance of logout Page' */
	public LogoutPage clickLogoutLink() {
		SideNavigationBarOnPage.clickOnSideNavMenuLink("logout");
		return new LogoutPage();
	}

//	public TestBase ClickOnNavigationBarLink(String linkName) {
//	SideNavigationBarOnPage.getLocator(linkName).click();
//	switch (linkName.toLowerCase()) {
//	case "edit_account":
//		return new EditPage();
//	case "returns":
//		return new ProductReturnsPage();
//	case "password":
//		return new ChangePasswordPage();
//	case "newsletter":
//		return new NewsLetterSubscriptionPage();
//	case "logout":
//		return new LogoutPage();
//	}
//	return null;
//}
}
