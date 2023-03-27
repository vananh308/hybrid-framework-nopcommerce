package com.facebook.register;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.facebook.LoginPageObject;
import pageObjects.facebook.PageGeneratorManager;

public class Level_13_Element_Undisplayed extends BaseTest {
	private LoginPageObject loginPage;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);

		loginPage = PageGeneratorManager.getLoginPage(driver);
	}

	@Test
	public void TC_01_Verify_Element_Displayed() {
		loginPage.clickToCreateNewAccountButton();

		// Nếu 1 cái hàm chỉ mong đợi để verify element displayed thôi - kết hợp cả wait
		// + isDisplayed
		loginPage.enterToEmailAddressTextbox("automationfc@gmail.com");
		loginPage.sleepInSecond(3);
		verifyTrue(loginPage.isConfirmEmailAddressTextboxDisplayed());
	}

	@Test
	public void TC_02_Verify_Element_UnDisplayed_In_DOM() {
		// Nếu như mình mong đợi 1 cái hàm vừa verify displayed/ undisplayed thì không
		// được kết hợp wait

		loginPage.enterToEmailAddressTextbox("");
		loginPage.sleepInSecond(3);
		// verifyFalse(loginPage.isConfirmEmailAddressTextboxDisplayed());
		verifyTrue(loginPage.isConfirmEmailAddressTextboxUndisplayed());
	}

	@Test
	public void TC_03_Verify_Element_UnDisplayed_Not_In_DOM() {
		loginPage.clickCloseIconAtRegisterForm();
		loginPage.sleepInSecond(3);

		// verifyFalse(loginPage.isConfirmEmailAddressTextboxDisplayed());

		verifyTrue(loginPage.isConfirmEmailAddressTextboxUndisplayed());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private WebDriver driver;
}
