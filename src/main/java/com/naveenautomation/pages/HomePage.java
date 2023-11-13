package com.naveenautomation.pages;

import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.base.TestBase;

public class HomePage extends TestBase {
	public HomePage() {
		PageFactory.initElements(wd, this);
	}

	public String getHomePageTitle() {
		return wd.getTitle();
	}
}
