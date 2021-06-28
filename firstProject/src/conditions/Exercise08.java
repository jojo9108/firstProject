package conditions;

import java.util.Scanner;

public class Exercise08 {

	// 필드..
	static int balance = 0;
	static Scanner scn = new Scanner(System.in);

	public static boolean checkAdmin(String id, String pass) {
		if (id.equals("admin") && pass.equals("1234")) {
			return true;
		}
		return false;
	}

	public static void printMenu() {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("1.예금 2.출금 3.잔액 4.종료");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("선택> ");
	}

	public static void deposit() {
		System.out.println("금액을 입력하세요>>> ");
		int temp = scn.nextInt();
		if (balance + temp <= 100000) {
			//balance = balance + temp;
			balance = add(balance, temp);
			System.out.println(balance + "원이 입금되었습니다.");
		} else {
			System.out.println("입금 금액을 초과해 입금이 불가합니다.");
		}
	}

	public static void withdraw() {
		System.out.println("금액을 입력하세요>>> ");
		int temp = scn.nextInt();
		if (balance < temp) {
			System.out.println("출금 하실 수 없습니다.");
		} else if (balance >= temp) {
			//balance = balance - temp;
			balance = add(balance, -temp);
			System.out.println(temp + "원이 출금되었습니다.");
		}
	}

	public static int add(int balance, int amount) {
		int sum = balance + amount;
		return sum;
	}

	public static void main(String[] args) {
		// 간단한 예금출금 프로그램.

		boolean run = false;

		do {
			if (!run) {
				// id, pass = admin, 1234
				System.out.println("id를 입력하세요>>>");
				String id = scn.nextLine();
				System.out.println("pass를 입력하세요>>>");
				String pass = scn.nextLine();

				run = checkAdmin(id, pass);
			} else {
				// 메뉴출력.
				printMenu(); // 메소드 호출..
				int menu = scn.nextInt();
				if (menu == 1) {
					System.out.println("예금처리.");
					deposit();
				} else if (menu == 2) {
					System.out.println("출금처리.");
					withdraw();
				} else if (menu == 3) {
					System.out.println("잔액조회처리.");
					System.out.println("현재 잔액은 " + balance + " 원입니다.");
				} else if (menu == 4) {
					run = false;
				}

			}

		} while (run); // while
		System.out.println("프로그램을 종료합니다.");
	}// m
}// c
