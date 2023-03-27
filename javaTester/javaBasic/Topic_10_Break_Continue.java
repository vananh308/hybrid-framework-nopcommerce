package javaBasic;

public class Topic_10_Break_Continue {

	public static void main(String[] args) {
		// Nested for
		for (int i = 1; i <= 5; i++) {
			System.out.println("Lần chạy của i (for trên) = " + i);

			// 1
			// Mỗi 1 lần chạy của for trên sẽ apply cho tất cả các lần chạy của for dưới này
			for (int j = 0; j <= 5; j++) {
				if (j == 4) {
					// Loại trừ 1 điều kiện này ra
					continue;
				}
				System.out.println("j = " + j);
			}
		}
	}
}
