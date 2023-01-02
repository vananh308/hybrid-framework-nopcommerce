package com.nopcommerce.user;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class User_01_Register_Login {
	// Toàn cục
	String homePageUrl = "";

	public void beforeClass() {

	}

	@Test
	public void TC_01() {
		// Cục bộ: Sử dụng trong phạm vi của testcase/ hàm
		String homePageUrl = "";

		System.out.println(homePageUrl);
		
		// Block code: khối lệnh
		if(3<5) {
			// Cục bộ
			String homePagetTitle = "";
			
			System.out.println(homePagetTitle);
		}
	}

	@Test
	public void TC_02() {

	}

	@AfterClass
	public void afterClass() {
	}

}
