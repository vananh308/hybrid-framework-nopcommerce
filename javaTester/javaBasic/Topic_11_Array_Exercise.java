package javaBasic;

import org.testng.annotations.Test;

public class Topic_11_Array_Exercise {
	int number[] = { 5, 8, 15, 7, 60, 1 };

	@Test
	public void TC_01_Find_Max_Number() {
		int x = 0;
		for (int i = 0; i < number.length; i++) {
			if (x < number[i]) {
				x = number[i];
			}
		}
		System.out.println("Max number = " + x);
	}
}
