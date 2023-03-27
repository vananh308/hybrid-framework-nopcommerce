package javaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic_11_Array {

	public static void main(String[] args) {

		// int number[] = { 12, 7, 5, 6, 15 };
		//
		// int[] student = { 12, 7, 5, 6, 15 };
		//
		// // Lấy ra phần tử đầu tiên
		// System.out.println(student[0]);
		// System.out.println(student[1]);

		// Được define cố định bao nhiều phần tử khi mình viết code (Compile)
		String studentName[] = { "Nam", "Long", "An" };

		// String stdNewName[] = studentName.clone();

		// studentName[0] = "Hoa";

		// int b[] = new int[5];
		// b[0] = 10;

		for (int i = 0; i < studentName.length; i++) {

			if (studentName[i].equals("Long")) {
				System.out.println("Click vào Long");
			}
		}

		// Ko kết hợp với điều kiện
		for (String std : studentName) {
			if (std.equals("Long")) {
				System.out.println("Click vào Long");
			}
		}

		// Động
		ArrayList<String> stdName = new ArrayList<String>();

		// Khi chạy code mới add
		for (String std : studentName) {
			stdName.add(std);
		}

		List<String> names = Arrays.asList("Tom", "Jerry", "Donald");
		for (String name : names) {
			System.out.println("Name: " + name);
		}

		String std_Name = Arrays.toString(studentName);
		System.out.println(std_Name);

		// "[Nam, Long, An]"
	}
}
