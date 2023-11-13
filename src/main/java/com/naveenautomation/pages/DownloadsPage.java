package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.base.TestBase;

public class DownloadsPage extends TestBase {
	public DownloadsPage() {
		PageFactory.initElements(wd, this);
	}

	/* Locating the elements */
	@FindBy(css = "#content>p")
	WebElement accountDownloadsMessage;

	@FindBy(css = "a.btn-primary")
	WebElement continueBtn;

	public String getMessageForDownloadPage() {
		return accountDownloadsMessage.getText();
	}

	public AccountPage clickContinueBtn() {
		continueBtn.click();
		return new AccountPage();
	}
}
