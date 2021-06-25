package conditions;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		// 임의의 수 1, 2, 3 을 생성.
		// 사용자 값을 입력... 2 입력.
		// 임의의 값 = 사용자 입력값.
		// 정답입니다. 틀렸습니다.

		int ran = (int) (Math.random() * 3) + 1; // 1~3 범위의 임의의 값.
		System.out.println(ran);
		Scanner scanner = new Scanner(System.in); // System.in : 키보드입력.
		System.out.println("숫자입력..");
		int val = scanner.nextInt();
		System.out.println("입력값: " + val);

		if (ran == val) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("틀렸습니다.");
		}
		
		// 임의의 수 1, 2, 3 을 생성. => 1: 가위, 2: 바위, 3: 보
				// 사용자 값을 입력... 2 입력.
				// 임의의 값 = 사용자 입력값.
				// 정답입니다. 틀렸습니다.
		
		
		Scanner scannner = new Scanner(System.in);
		System.out.println("숫자입력..");
		int score = scanner.nextInt();
		System.out.println("입력값: " + score);
		
		if (score == 1) {
			System.out.println("가위");
		} else if (score == 2){
			System.out.println("바위");
		} else {
			System.out.println("보");
		}

		//if ("가위".equals(name)) {
		//System.out.println("가위");
		//} else {
		//System.out.println("다릅니다.");
		//}
		//String name = scanner.nextLine();
		//System.out.println("이름은: " + name); // == equals()
		 
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("가위바위보 입력> ");
		String val1= scanner.nextLine();
		
	/*anyval.equals(val1)) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다.");
		} */
				
		
	}

}


