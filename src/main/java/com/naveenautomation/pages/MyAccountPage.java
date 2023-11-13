package com.naveenautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.naveenautomation.proxyDriver.ProxyDriver;

public class MyAccountPage extends Page {

	private static final String PAGE_URL = "/opencart/index.php?route=account/account";

	public MyAccountPage(WebDriver wd, boolean waitForPageToLoad) {
		super(wd, waitForPageToLoad);
	}

	private static final By phonelink = By.cssSelector("i.fa.fa-phone");
	private static final By GiftCertificatesLink = By
			.cssSelector("footer div.row div.col-sm-3:nth-of-type(3) ul li:nth-of-type(2) a");
	private static final By myAccountText = By.xpath("//h2[text()='My Account']");
	private static final By changePasswordLink = By.cssSelector("#column-right a:nth-of-type(3)");
	private static final By successBanner = By.cssSelector("div.alert-success");
	private static final By orderHistoryLink = By.cssSelector("div.list-group a:nth-of-type(6)");
	private static final By editAccountLink = By.xpath("//a[text()='Edit Account']");
	private static final By registerForAnAffiliateAccount = By.cssSelector("a[href$='affiliate/add']");
	private static final By affiliateAccountCreationSuccessText = By.cssSelector("div.alert");
	private static final By componentsHoverButton = By.cssSelector("li.dropdown:nth-of-type(3) a.dropdown-toggle");
	public static final By monitorsLink = By.cssSelector(" ul li.dropdown:nth-of-type(3) li:nth-of-type(2) a");
	private static final By cameraLink = By.cssSelector("div.navbar-collapse ul>li:nth-of-type(7) a");
	private static final By addToReturnLink = By.xpath("(//a[text()='Returns']) [2]");
	private static final By clickOnSpecialsLink = By.xpath("//a[text()=\"Specials\"]");
	private static final By passwordChangesSuccessBanner = By.cssSelector("div.alert-success");
	private static final By desktop = By.cssSelector("ul.nav>li:first-of-type>a");
	private static final By showAllDesktop = By.xpath("//a[text()='Show All Desktops']");

	public String getMyAccountText() {
		return ((ProxyDriver) wd).getText(myAccountText);
	}


	public String getPasswordChangeSuccessMessage() {
		return ((ProxyDriver) wd).getText(passwordChangesSuccessBanner);
	}

	public String getSuccessMessageText() {
		return ((ProxyDriver) wd).getText(successBanner);

	}

	public String getAffiliateAccountCreationSuccessText() {
		return ((ProxyDriver) wd).getText(affiliateAccountCreationSuccessText);

	}
	
	@Override
	protected void isLoaded() {

		if (!urlContains(wd.getCurrentUrl())) {
			throw new Error();
		}
	}

	@Override
	protected String getPageUrl() {
		return getDomain() + PAGE_URL;
	}

	@Override
	public MyAccountPage get() {
		return (MyAccountPage) super.get();
	}

}