package operator;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 100;
		// 60보다 크면 console "합격입니다";
		// 60보다 작으면 console "불합격입니다";
		if (score > 60) {
			System.out.println("그에게 주어지는 합격의 목걸이");
		} else if (score == 60) {
			System.out.println("합겨어어어어어억");
		} else {
			System.out.println("불합격입니다.");
		}
		System.out.println("-------------------------------");
		// 100점은 A++
		// 90점 이상 A학점.
		// 80점 이상 B학점.
		// 70점 이상 C학점.
		// 60점 이상 D학점.
		// 이하 F학점.
		if (score == 100) {
			System.out.println("A++");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		} else if (score < 60) {
			System.out.println("F학점");
		} else if (score >= 100) {
			System.out.println("A학점");
			
		} // end of if구문
	} // end of main()

} // end of class
