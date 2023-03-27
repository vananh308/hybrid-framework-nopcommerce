package javaBasic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Topic_08_For_Foreach {
	WebDriver driver;

	public void TC_01_For_Iterate() {
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(i);

		// Vế 1: biến tạm dùng để tăng giá trị lên sau mỗi lần duyệt
		// Dùng để so sánh với tổng giá trị
		// Vế 2: So sánh với tổng
		// Vế 3: Tăng i lên 1 đơn vị sau khi chạy vào thân vòng for

		// }
		// Array/ List/ Set/ Queue (index)

		// For kết hợp if: Thoả mãn điều kiện mới action
		// Biến đếm - dùng để điều kiện để filter
		String[] cityName = { "Ha Noi", "Ho Chi Minh", "Da Nang", "Can Tho" };

		for (int i = 0; i < cityName.length; i++) {
			if (cityName[i].equals("Da Nang")) {
				// Action
				System.out.println("Do Action!");
				break;
			}
			// Không có break tất cả các giá trị (element) đều được chạy qua dù thoả mãn
			// điều kiện rồi
		}

		// Dùng để chạy quà hết tất cả các giá trị
		int y = 0;
		for (String city : cityName) {
			if (cityName[y].equals("Da Nang")) {
				System.out.println("Do action");
				System.out.println(city);
				break;
			}
			y++;
		}

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
	}

	@Test
	public void TC_02_ForEach() {
		String[] cityName = { "Ha Noi", "Ho Chi Minh", "Da Nang", "Can Tho", "Hai Phong", "Khanh Hoa" };

		// Java Collection
		// Class: ArrayList/ LinkedList/ Vector/..
		// Interface: List/ Set/ Queue
		List<String> cityAddress = new ArrayList<String>();
		System.out.println(cityAddress.size());

		// Compile (Coding)
		cityAddress.add("Bac Giang");
		cityAddress.add("Ha Giang");
		cityAddress.add("Sa Pa");

		System.out.println(cityAddress.size());

		// Runtime (Running)
		for (String city : cityName) {
			cityAddress.add(city);
		}
		System.out.println(cityAddress.size());

		for (String cityAdd : cityAddress) {
			System.out.println(cityAdd);
		}

		// Java Generic
		//List<WebElement> links = driver.findElements(By.xpath("//a"));

		// Xử lý dữ liệu/ get text/ value/ css/ attribute
		//for (WebElement link : links) {
			// Chuyển page
			// Refresh DOM/ HTML
			// ko còn tồn tại
			// Fail -> StaleElementException
	}
}
