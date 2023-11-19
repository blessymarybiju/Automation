
package com.naveenautomation.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeClass;

import com.naveenautomation.Browser.Browser;
import com.naveenautomation.environment.Environment;
import com.naveenautomation.proxyDriver.ProxyDriver;
import com.naveenautomation.utils.WebDriverEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver wd;

	private final Browser DEFAULT_BROWSER = Browser.CHROME;
	private final Environment URL = Environment.PROD;
	public String emailId = "navenncxe@gmail.com";
	public String password = "abcd";
	public static Logger logger;
	public WebDriverEvent events;
	public EventFiringWebDriver e_driver;
	private Browser BROWSER = Browser.CHROME;
	private static final boolean RUN_ON_GRID = true;

	@BeforeClass
	public void loggerSteup() {
		logger = Logger.getLogger(TestBase.class);
		PropertyConfigurator.configure("log4j.properties");
		BasicConfigurator.configure();
		logger.setLevel(Level.INFO);
	}

	public void intialisation() {
		if (RUN_ON_GRID) {
			try {
				wd = new RemoteWebDriver(new URL("http://10.0.0.78:4040/"), getOptions());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		} else {
			switch (DEFAULT_BROWSER) {
			case CHROME:
				wd = new ProxyDriver(WebDriverManager.chromedriver().create());
				break;
			case EDGE:
				wd = new ProxyDriver(WebDriverManager.edgedriver().create());
				break;
			case FIREFOX:
				wd = new ProxyDriver(WebDriverManager.firefoxdriver().create());
				break;
			default:
				throw new IllegalArgumentException();
			}
		}
		// Wrap the instance
		e_driver = new EventFiringWebDriver(wd);

		// Events which need to be captured
		events = new WebDriverEvent();
		e_driver.register(events);

		// Assigning back the value to Web driver
		wd = e_driver;

		/* Loading the Page */
		wd.get(URL.getUrl());
		/* Maximize the browser window */
		wd.manage().window().maximize();
		wd.manage().deleteAllCookies();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public MutableCapabilities getOptions() {
		return new ManageOptions().getOption(BROWSER);
	}

	public void tearDown() {
		wd.quit();
	}

	/* Creating enum for side navigation bar */
	public enum SideNavigationBarOnPage {
		MY_ACCOUNT(wd.findElement(By.cssSelector("#column-right>div>a:nth-of-type(1)"))),
		EDIT_ACCOUNT(wd.findElement(By.cssSelector("#column-right>div>a:nth-of-type(2)"))),
		PASSWORD(wd.findElement(By.cssSelector("#column-right>div>a:nth-of-type(3)"))),
		ADDRESS_BOOK(wd.findElement(By.cssSelector("#column-right>div>a:nth-of-type(4)"))),
		WISH_LIST(wd.findElement(By.cssSelector("#column-right>div>a:nth-of-type(5)"))),
		ORDER_HISTORY(wd.findElement(By.cssSelector("#column-right>div>a:nth-of-type(6)"))),
		DOWNLOADS(wd.findElement(By.cssSelector("#column-right>div>a:nth-of-type(7)"))),
		RECURRING_PAYMENTS(wd.findElement(By.cssSelector("#column-right>div>a:nth-of-type(8)"))),
		REWARD_POINTS(wd.findElement(By.cssSelector("#column-right>div>a:nth-of-type(9)"))),
		RETURNS(wd.findElement(By.cssSelector("#column-right>div>a:nth-of-type(10)"))),
		TRANSACTIONS(wd.findElement(By.cssSelector("#column-right>div>a:nth-of-type(11)"))),
		NEWSLETTER(wd.findElement(By.cssSelector("#column-right>div>a:nth-of-type(12)"))),
		LOGOUT(wd.findElement(By.cssSelector("#column-right>div>a:nth-of-type(13)")));

		private WebElement webElement;

		SideNavigationBarOnPage(WebElement webElement) {
			this.webElement = webElement;
		}

		public WebElement getSideNavMenu() {
			return webElement;

		}

		public static void clickOnSideNavMenuLink(String linkName) {
			// for (SideNavigationBarOnPage link : SideNavigationBarOnPage.values()) {
			List<WebElement> sideNavElements = wd.findElements(By.cssSelector("div.list-group>a"));
			for (int i = 0; i < sideNavElements.size(); i++) {
				if (sideNavElements.get(i).getText().toString().equalsIgnoreCase(linkName)) {
					sideNavElements.get(i).click();
					break;
				}
			}
		}

	}

}
