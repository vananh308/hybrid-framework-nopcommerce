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
import pageObjects.nopCommerce.user.UserCustomerInfoPageObject;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class Level_15_ReportNG_Screenshot extends BaseTest {

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);

		homePage = PageGeneratorManager.getUserHomePage(driver);

		firstName = "Automation";
		lastName = "FC";
		emailAddress = "afc" + generateFakeNumber() + "@mail.vn";
		password = "123456";
	}

	@Test
	public void User_01_Register() {
		log.info("Register - Step 01: Nagivate to 'Register' page'");
		registerPage = homePage.clickToRegisterLink();

		log.info("Register - Step 02: Enter to Firstname textbox with value is '" + firstName + "'");
		registerPage.inputToFirstnameTextbox(firstName);

		log.info("Register - Step 03: Enter to Lastname textbox with value is '" + lastName + "'");
		registerPage.inputToLastnameTextbox(lastName);

		log.info("Register - Step 04: Enter to Email textbox with value is '" + emailAddress + "'");
		registerPage.inputToEmailTextbox(emailAddress);

		log.info("Register - Step 05: Enter to Password textbox with value is '" + password + "'");
		registerPage.inputToPasswordTextbox(password);

		log.info("Register - Step 06: Enter to Confirm Password textbox with value is '" + password + "'");
		registerPage.inputToConfirmPasswordTextbox(password);

		log.info("Register - Step 07: Click to 'Register' button");
		registerPage.clickToRegisterButton();

		log.info("Register - Step 08: Verify Register success message is displayed");
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed...");

	}

	@Test
	public void User_02_Login() {
		log.info("Login - Step 01: Navigate to Login page");
		loginPage = homePage.clickToLoginLink();

		log.info("Login - Step 02: Enter to Email textbox with value is '" + emailAddress + "'");
		loginPage.inputToEmailTextbox(emailAddress);

		log.info("Login - Step 03: Enter to Password textbox with value is '" + password + "'");
		loginPage.inputToPasswordTextbox(password);

		log.info("Login - Step 04: Click to Login button");
		homePage = loginPage.clickToLoginButton();

		log.info("Login - Step 05: Verify 'My Account' link is displayed");
		Assert.assertFalse(homePage.isMyAccountLinkDisplayed());

		log.info("Login - Step 06: Navigate to 'My Account' page");
		customerInfoPage = homePage.clickToMyAccountLink();

		log.info("Login - Step 07: Verify 'Customer Infor' page is displayed");
		Assert.assertFalse(customerInfoPage.isCustomerInfoPageDisplayed());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private WebDriver driver;
	private String firstName, lastName, emailAddress, password;
	// Declare + Init
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private UserLoginPageObject loginPage;
	private UserCustomerInfoPageObject customerInfoPage;

	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}
}
