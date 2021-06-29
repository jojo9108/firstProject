package referece;

public class ArrayExample3 {
	public static void main(String[] args) {
		//크기순 정렬하기.
		int num1 = (int) (Math.random() * 25); // (int) (Math.random() * 25);
		int num2 = (int) (Math.random() * 25);
		int num3 = (int) (Math.random() * 25);

		int[] intAry = new int[3];
		if (num1 > num2) {
			if (num1 > num3) {
				if (num2 > num3) {
					intAry[0] = num1;
					intAry[1] = num2;
					intAry[2] = num3;
				}
			} else {
				if (num2 > num3) {
					if (num1 > num3) {
						intAry[0] = num2;
						intAry[1] = num1;
						intAry[2] = num3;
					}
				} else {
					intAry[0] = num3;
					intAry[1] = num2;
					intAry[2] = num1;
				}
			}
		} else {
			intAry[0] = num3;
			intAry[1] = num1;
			intAry[2] = num2;
		}

		intAry[0] = num3;
		intAry[1] = num1;
		intAry[2] = num2;

		for (int n : intAry) {
			System.out.println(n);
		}
	}
}
