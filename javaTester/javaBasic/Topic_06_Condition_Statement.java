package javaBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Topic_06_Condition_Statement {
	
	WebDriver driver;
	
	public void TC_01_If() {
		boolean status = 5 < 3;
		System.out.println(status);
		
		// hàm if sẽ nhận vào 1 điều kiện đúng
		// Kiểm tra duy nhất 1 điều kiện
		// Nếu điều kiện này đúng thì sẽ action (xxx) trong phần thân
		if (status) {
			// Đúng thì vào phần thân if
			// Sai thì bỏ qua
			System.out.println("Go to if");
		}
		// Gán (assign)
		int studentNumber = 10;
		
		//  == So sánh
		status = (studentNumber == 10);
		System.out.println(status);
		
		WebDriver driver = new FirefoxDriver();
		
		WebElement salePopup = driver.findElement(By.id(""));
		// Element luôn luôn có trong DOM dù popup hiển thị hay không
		if (salePopup.isDisplayed()) {
			
		}
		// Element ko có trong DOM khi popup ko hiển thị
		List<WebElement> salePopups = driver.findElements(By.id(""));
		
		// Check element ko hiển thị
		if (salePopups.size() > 0 && salePopups.get(0).isDisplayed()) {
			
		}
		
		// Uncheck to checkbox
		WebElement languagesCheckbox = driver.findElement(By.id(""));
		if (languagesCheckbox.isSelected()) {
			languagesCheckbox.click();
		}
		
		// Check to checkbox
		if (!languagesCheckbox.isSelected()) {
			languagesCheckbox.click();
		}
	}

	@Test
	public void TC_02_If_Else( ) {
		// Có tới 2 điều kiện: nếu như đúng thì vào if - sai thì vào else
		
		// Nếu driver start với browser như Chrome/ Firefox/ Edge/ Safari thì dùng hàm click
		// thông thường (builtin) của Selenium WebElement
		
		// Nếu driver là IE thì dùng hàm click của JavascriptExecutor
			
	}
}
