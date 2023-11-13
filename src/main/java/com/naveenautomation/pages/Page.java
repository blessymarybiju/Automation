package com.naveenautomation.pages;

import org.openqa.selenium.WebDriver;

public abstract class Page extends GeneralPage {

	private static final String URL = "https://naveenautomationlabs.com";

	public Page(WebDriver wd, boolean waitForPageToLoad) {
		super(wd, waitForPageToLoad);
	}

	public String getDomain() {
		return URL;
	}

	@Override
	protected String getPageUrl() {
		return getDomain();
	}

}