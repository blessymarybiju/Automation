package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.base.TestBase;

public class ForgottenPasswordPage extends TestBase {
	public ForgottenPasswordPage() {
		PageFactory.initElements(wd, this);
	}

	/* Locating the elements */

	@FindBy(css = "#input-email")
	WebElement emailInput;

	@FindBy(css = "input[value='Continue']")
	WebElement submitBtn;

	@FindBy(css = "div.alert-danger")
	WebElement forgetPwdInvalidCredentialMessage;

	public void enterEmail(String email) {
		emailInput.sendKeys(email);
	}

	public LoginPage clickSubmitBtn() {
		submitBtn.click();
		return new LoginPage();
	}

	public String getSuccessMessageForForgetPwd() {
		return forgetPwdInvalidCredentialMessage.getText();
	}
}
