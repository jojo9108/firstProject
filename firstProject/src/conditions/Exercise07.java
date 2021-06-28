package conditions;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		// 간단한 예금출금 프로그램.
		int balance = 0;
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.예금 2.출금 3.잔액 4.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("선택> ");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("예금처리.");
				System.out.println("금액을 입력하세요>>> ");
				int temp = scn.nextInt();
				if (balance >= 100000) {
					System.out.println("입금 금액을 초과해 입금이 불가합니다.");
				} else if (balance < 100000) {
					balance = balance + temp;
					System.out.println(balance + "원이 입금되었습니다.");
				}
				

			} else if (menu == 2) {
				System.out.println("출금처리.");
				System.out.println("금액을 입력하세요>>> ");
				int temp = scn.nextInt();
				if (balance < temp) {
					System.out.println("출금 하실 수 없습니다.");
				} else if (balance >= temp) {
					balance = balance - temp;
				System.out.println(temp + "원이 출금되었습니다.");
				}
				
			} else if (menu == 3) {
				System.out.println("잔액조회처리.");
				System.out.println("현재 잔액은 " + balance + " 원입니다.");

			} else if (menu == 4) {
				break;
			}

		}
		System.out.println("프로그램을 종료합니다.");
	}// m
}// c
