package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.naveenautomation.base.TestBase;

public class EditPage extends TestBase {
	public EditPage() {
		PageFactory.initElements(wd, this);
	}

	/* Locating the elements */

	@FindBy(id = "input-firstname")
	WebElement firstNameInput;

	@FindBy(id = "input-lastname")
	WebElement lastNameInput;

	@FindBy(id = "input-email")
	WebElement emailInput;

	@FindBy(id = "input-telephone")
	WebElement telePhoneInput;

	@FindBy(css = "input[value='Continue']")
	WebElement submitBtn;

	public void enterFName(String fname) {
		firstNameInput.clear();
		firstNameInput.sendKeys(fname);
	}

	public void enterLName(String lname) {
		lastNameInput.clear();
		lastNameInput.sendKeys(lname);
	}

	public void enterEmail(String email) {
		emailInput.clear();
		emailInput.sendKeys(email);
	}

	public void enterTelephone(String number) {
		telePhoneInput.clear();
		telePhoneInput.sendKeys(number);
	}

	public AccountPage clickSubmitBtn() {
		submitBtn.click();
		return new AccountPage();
	}

}
