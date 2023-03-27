package com.jquery;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.jQuery.dataTable.HomePageObject;
import pageObjects.jQuery.dataTable.PageGeneratorManager;

public class Level_10_DataTable_DataGrid extends BaseTest {
	HomePageObject homePage;
	List<String> actualAllCountryValues;
	List<String> expectedAllCountryValues;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		homePage = PageGeneratorManager.getHomePage(driver);
	}

	public void Table_01_Paging() {
		homePage.openPagingByPageNumber("10");
		homePage.sleepInSecond(1);
		Assert.assertTrue(homePage.isPageNumberActived("10"));

		homePage.openPagingByPageNumber("20");
		homePage.sleepInSecond(1);
		Assert.assertTrue(homePage.isPageNumberActived("20"));

		homePage.openPagingByPageNumber("7");
		homePage.sleepInSecond(1);
		Assert.assertTrue(homePage.isPageNumberActived("7"));

		homePage.openPagingByPageNumber("16");
		homePage.sleepInSecond(1);
		Assert.assertTrue(homePage.isPageNumberActived("16"));
	}

	public void Table_02_Enter_To_Header() {
		homePage.refreshCurrentPage(driver);

		homePage.enterToHeaderTextboxByLabel("Country", "Zambia");
		homePage.enterToHeaderTextboxByLabel("Females", "180000");
		homePage.enterToHeaderTextboxByLabel("Males", "181000");
		homePage.enterToHeaderTextboxByLabel("Total", "361000");
		homePage.sleepInSecond(3);

		homePage.enterToHeaderTextboxByLabel("Country", "India");
		homePage.enterToHeaderTextboxByLabel("Females", "11727960");
		homePage.enterToHeaderTextboxByLabel("Males", "13060130");
		homePage.enterToHeaderTextboxByLabel("Total", "24788090");
		homePage.sleepInSecond(3);
	}

	public void Table_03_Enter_To_Header() {
		// Actual value
		actualAllCountryValues = homePage.getValueEachRowAtAllPage();

		Assert.assertEquals(actualAllCountryValues, expectedAllCountryValues);
	}

	@Test
	public void Table_04_Action_At_Any_Row() {
		homePage.clickToLoadButton();
		homePage.sleepInSecond(2);

		// homePage.enterToTextboxByColumnNameAtRowNumber("Company", "2", "Viettel");
		// homePage.sleepInSecond(3);
		//
		// homePage.enterToTextboxByColumnNameAtRowNumber("Contact Person", "4", "Van
		// Anh");
		// homePage.sleepInSecond(3);
		//
		// homePage.enterToTextboxByColumnNameAtRowNumber("Order Placed", "3", "918");
		// homePage.sleepInSecond(3);
		//
		// homePage.selectDropdownByColumnNameAtRowNumber("Country", "5", "Japan");
		// homePage.sleepInSecond(3);
		//
		// homePage.checkToCheckboxByColumnNameAtRowNumber("NPO?", "3");
		// homePage.checkToCheckboxByColumnNameAtRowNumber("NPO?", "5");
		//
		// homePage.uncheckToCheckboxByColumnNameAtRowNumber("NPO?", "1");
		// homePage.uncheckToCheckboxByColumnNameAtRowNumber("NPO?", "2");
		// homePage.uncheckToCheckboxByColumnNameAtRowNumber("NPO?", "4");

		homePage.clickToIconByRowNumber("1", "Remove Current Row");
		homePage.sleepInSecond(2);

		homePage.clickToIconByRowNumber("1", "Insert Row Above");
		homePage.sleepInSecond(2);

		homePage.clickToIconByRowNumber("3", "Move Up");
		homePage.sleepInSecond(2);

		homePage.clickToIconByRowNumber("5", "Remove Current Row");
		homePage.sleepInSecond(2);

		homePage.clickToIconByRowNumber("4", "Remove Current Row");
		homePage.sleepInSecond(2);

		homePage.clickToIconByRowNumber("3", "Remove Current Row");
		homePage.sleepInSecond(2);

		homePage.clickToIconByRowNumber("2", "Remove Current Row");
		homePage.sleepInSecond(2);

		homePage.clickToIconByRowNumber("1", "Remove Current Row");
		homePage.sleepInSecond(2);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private WebDriver driver;

	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}
}
