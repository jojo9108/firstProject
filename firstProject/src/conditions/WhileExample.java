package conditions;

public class WhileExample {
	public static void main(String[] args) {
		// 초기값, 조건식, 증감식(for (int 1 = 0; i < 5; i++) { 실행문... }
		// for문을 while 문으로 바꿔보기
		int i = 0;
		while(i < 5) {
			//i가 조건에 참이면 실행을 하겠다는 뜻
			System.out.println("안녕하세요.");
			i++;
		}
		System.out.println("프로그램을 종료.");
		}
	}


