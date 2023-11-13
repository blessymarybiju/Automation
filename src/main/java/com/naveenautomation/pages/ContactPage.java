package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.base.TestBase;

public class ContactPage extends TestBase {

	public ContactPage() {
		PageFactory.initElements(wd, this);
	}

	/* Locating the elements */

	@FindBy(css = "#input-enquiry")
	WebElement enquiryTextarea;

	@FindBy(css = ".btn-primary")
	WebElement submitBtn;

	@FindBy(css = "#content>p")
	WebElement enquirySuccessMessage;

	private void enterEnquiry() {
		enquiryTextarea.sendKeys("This is a test enquiry!!!");
	}

	public void clickSubmitBtn() {
		enterEnquiry();
		submitBtn.click();
	}

	public String getMessageForShoppingCartPage() {
		return enquirySuccessMessage.getText();
	}

	public HomePage clickContinueBtn() {
		submitBtn.click();
		return new HomePage();
	}

}
