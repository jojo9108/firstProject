package conditions;

public class WhileExample4 {
	public static void main(String[] args) {
		// 1 ~ 50까지 2 또는 3의 배수의 합.
		// while 구문을 사용.

		// 초기값, 조건식, 증감식(for (int 1 = 0; i < 5; i++) { 실행문... }
		// for문을 while 문으로 바꿔보기
		int sum = 0;
		int i = 1;
		while (i <= 50) {
			if (i % 2 == 0 || i % 3 == 0) {
				sum = sum + i;
				System.out.println("현재 i : " + i);
				System.out.println("현재 sum : " + sum);
			}
			i++;
		}
		System.out.println("프로그램을 종료.");
	}

}
