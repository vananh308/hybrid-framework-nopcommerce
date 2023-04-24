package com.nopcommerce.user;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class Level_17_Custom_Close_Driver extends BaseTest {

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);

		homePage = PageGeneratorManager.getUserHomePage(driver);

		firstName = "Automation";
		lastName = "FC";
		emailAddress = "afc" + generateFakeNumber() + "@mail.vn";
		password = "123456";

		log.info("Pre-Condition - Step 01: Nagivate to 'Register' page'");
		registerPage = homePage.clickToRegisterLink();

		log.info("Pre-Condition - Step 02: Enter to Firstname textbox with value is '" + firstName + "'");
		registerPage.inputToFirstnameTextbox(firstName);

		log.info("Pre-Condition - Step 03: Enter to Lastname textbox with value is '" + lastName + "'");
		registerPage.inputToLastnameTextbox(lastName);

		log.info("Pre-Condition - Step 04: Enter to Email textbox with value is '" + emailAddress + "'");
		registerPage.inputToEmailTextbox(emailAddress);

		log.info("Pre-Condition - Step 05: Enter to Password textbox with value is '" + password + "'");
		registerPage.inputToPasswordTextbox(password);

		log.info("Pre-Condition - Step 06: Enter to Confirm Password textbox with value is '" + password + "'");
		registerPage.inputToConfirmPasswordTextbox(password);

		log.info("Pre-Condition - Step 07: Click to 'Register' button");
		registerPage.clickToRegisterButton();

		driver = null;

		log.info("Pre-Condition - Step 08: Verify Register success message is displayed");
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed...");

		log.info("Pre-Condition - Step 09: Navigate to Login page");
		loginPage = homePage.clickToLoginLink();

		log.info("Pre-Condition - Step 10: Enter to Email textbox with value is '" + emailAddress + "'");
		loginPage.inputToEmailTextbox(emailAddress);

		log.info("Pre-Condition - Step 11: Enter to Password textbox with value is '" + password + "'");
		loginPage.inputToPasswordTextbox(password);

		log.info("Pre-Condition - Step 12: Click to Login button");
		homePage = loginPage.clickToLoginButton();
	}

	@Test
	public void Search_01_Name() {

	}

	@Test
	public void Search_02_Address() {

	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserDriver();
	}

	private WebDriver driver;
	private String firstName, lastName, emailAddress, password;
	// Declare + Init
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private UserLoginPageObject loginPage;

	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}
}
