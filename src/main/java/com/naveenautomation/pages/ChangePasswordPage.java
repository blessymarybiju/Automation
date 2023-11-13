package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.base.TestBase;

public class ChangePasswordPage extends TestBase {

	public ChangePasswordPage() {
		PageFactory.initElements(wd, this);
	}

	/* Locating the elements */

	@FindBy(css = "#input-password")
	WebElement password;

	@FindBy(css = "#input-confirm")
	WebElement confirmPassword;

	@FindBy(css = ".btn-primary")
	WebElement continueBtn;

	private void enterPwd(String pwd) {
		password.sendKeys(pwd);
	}

	private void enterConfirmPwd(String confirmPwd) {
		confirmPassword.sendKeys(confirmPwd);
	}

	public AccountPage clickSubmitBtn(String pwd, String confirmPwd) {
		enterPwd(pwd);
		enterConfirmPwd(confirmPwd);
		continueBtn.click();
		return new AccountPage();
	}
}
