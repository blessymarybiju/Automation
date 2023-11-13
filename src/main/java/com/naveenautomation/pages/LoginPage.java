package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.base.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() {
		PageFactory.initElements(wd, this);
	}

	/* Locating the elements */

	@FindBy(id = "input-email")
	WebElement emailInput;

	@FindBy(id = "input-password")
	WebElement pwdInput;

	@FindBy(css = "input[type='Submit']")
	WebElement loginBtn;

	@FindBy(css = ".alert-danger")
	WebElement alertBanner;

	@FindBy(css = "div.form-group>a")
	WebElement forgetPwdLink;

	@FindBy(css = ".alert-success")
	WebElement emailSendConfirmationMessage;

	private void enterEmail(String email) {
		emailInput.sendKeys(email);
	}

	private void enterPassword(String password) {
		pwdInput.sendKeys(password);
	}

	public AccountPage SubmitLogin(String email, String password) {
		enterEmail(email);
		enterPassword(password);
		loginBtn.click();
		return new AccountPage();
	}

	public String getAlertText() {
		return alertBanner.getText();
	}

	public String getConfirmationTextForForgetPwd() {
		return emailSendConfirmationMessage.getText();
	}

	public ForgottenPasswordPage clickForgetPwdLink() {
		forgetPwdLink.click();
		return new ForgottenPasswordPage();
	}

}
