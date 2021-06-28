package conditions;

import java.util.Scanner;

public class WhileExample5 {
	public static void main(String[] args) {
		System.out.println("게임을 시작합니다.");
		// 임의의 수 => 가위, 바위, 보
		int ran = (int) (Math.random() * 3);
		String rsp = "";

		Scanner scn = new Scanner(System.in);

		while (true) {
			if (ran == 0) {
				rsp = "가위";
			} else if (ran == 1) {
				rsp = "바위";
			} else if (ran == 2) {
				rsp = "보";
			}

			System.out.println("뭐 낼래?: ");
			String name = scn.nextLine();
			if (rsp.equals("가위")) {
				if (rsp.equals("가위")) 
				System.out.println("You draw");
			}
			else if (name.equals("가위")) {
				if (name.equals("보"))
					;
				System.out.println("You Win");
			}
			else if (name.equals("가위")) {
				if (name.equals("바위"))
					;
				System.out.println("You Lose");
			}
			else if (name.equals("바위")) {
				if (name.equals("가위"))
					;
				System.out.println("You Win");
			}
			
			else if (name.equals("바위")) {
				if (name.equals("보"))
					;
				System.out.println("You Lose");
			}
			else if (name.equals("보")) {
				if (name.equals("바위"))
					;
				System.out.println("You Win");
			}
			
			else if (name.equals("보")) {
				if (name.equals("가위"))
					;
				System.out.println("You Lose");
			}
			else if (name.equals("quit")) {
				break;
			}
			System.out.println("나: " + name);
			System.out.println("컴퓨터: " + rsp);
			System.out.println("게임을 종료합니다");

			// 조건문...컴퓨터 가위/바위/보 <=> 내 가위/바위/보
			// You win..
			// You lose..
			// You draw..
		}

	}

}
