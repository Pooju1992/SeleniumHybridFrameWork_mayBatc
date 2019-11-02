package com.iNetBanking.TestCases;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.iNetBanking.PageObject.LoginPage;

public class LogingTestCase01 extends BaseClass {
	LoginPage login;

	@BeforeMethod
	public void setup() {
		browserSetup(browser, baseUrl);
		login = new LoginPage(driver);
	}

	@Test
	public void loginTest() {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);

		lp.setPassword(password);

		lp.clickSubmit();
		if (driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);

		} else {
			Assert.assertFalse(false);
		}
	}

}