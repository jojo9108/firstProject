package conditions;

public class ForExample {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요.");
		}

		System.out.println("반복문 종료.");

		for (int a = 0; a < 10; a++) {
			System.out.println("반갑구만 반가워요");
		}
		System.out.println("반복문 종료.");

		for (int b = 0; b < 10; b++) {
			System.out.println("재미있어요" + b);
		}
		System.out.println("반복문 종료.");

		for (int d = 1; d <= 10; d++) {
			System.out.println(d);
		}
		System.out.println("반복문 종료.");

		// 1 ~ 10 합을 구하는 프로그램.
		int sum = 0;
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				sum = sum + i;
				System.out.println("현재 i : " + i);
				System.out.println("현재 sum : " + sum);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else if (i == 5) {
				break;
			}
		}
		System.out.println("최종합계 " + sum);
	}
}



