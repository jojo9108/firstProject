package referece;

import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] names = new String[5];
		String[] number = new String[5];

		number[0] = "첫번째";
		number[1] = "두번째";
		number[2] = "세번째";
		number[3] = "네번째";
		number[4] = "다섯번째";

		names[0] = "Hong"; // 첫번째.
		names[1] = "Hwang"; // 두번째.
		names[2] = "Park"; // 세번째.
		names[3] = "Kim"; // 네번째.
		names[4] = "Choi"; // 다섯번째.

		while (true) {
			boolean pass = false;
			System.out.println("이름을 입력하세요 >>> ");
			String input = scn.nextLine();
			if (input.equals("quit")) {
				break;
			}

			for (int i = 0; i < names.length; i++) {
				if (input.equals(names[i])) {
					System.out.println(number[i] + "입니다.");
					pass = true;
				}
			}
			if (!pass) {
				System.out.println("같은 이름이 없습니다.");
			}
		}
		System.out.println("프로그램을 종료합니다.");

		// Hong Enter => 첫번째 위치에 있습니다.
		// quit Enter => 프로그램 종료.
		// Lee Enter => 이런 이름은 없습니다.

	} // m
}// c
