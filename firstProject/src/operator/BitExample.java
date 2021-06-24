package operator;

public class BitExample {
	public static void main(String[] args) {
		int numb1 = 10;
		numb1 = -numb1;
		
		System.out.println("numb1의 값: " + (~numb1 + 1)); //-11+1
		
		int var1, var2, result;
		var2 = var1 = 10;
		
		result = var1 + var2;
		result = sum(var1, var2);
		System.out.println("결과값: " + result);
		
	}

	public static int sum(int a, int b) {
		int val = a + b - 5;
		return val;
		
		
	}	
	
	public static String getName() {
		String name = "Welcome 홍길동";
		return name;
	}
	
}
