package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_09_Exericse {
	static Scanner scanner = new Scanner(System.in);

	public void TC_01() {
		int number = scanner.nextInt();

		for (int i = number; i < 100; i++) {
			// Chia hết cho 2
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	// @Test
	public static void TC_02_While() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();

		// các số từ a tới b
		while (numberA < numberB) {
			if (numberA % 3 == 0 && numberA % 5 == 0) {
				System.out.println(numberA);
			}
			numberA++;
		}
	}

	// @Test
	public static void TC_03_While() {
		int numberA = scanner.nextInt();
		int i = 0;

		while (numberA > 0) {
			if (numberA % 2 != 0) {
				i += numberA;
			}
			numberA--;
		}
		System.out.println(i);
	}

	@Test
	public static void TC_04_While() {
		int numberA = scanner.nextInt();
		int i = 1;

		while (numberA > 0) {
			i *= numberA;
			numberA--;
		}
		System.out.println(i);
	}
}
