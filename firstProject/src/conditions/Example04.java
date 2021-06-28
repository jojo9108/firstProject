package conditions;

public class Example04 {
	public static void main(String[] args) {
		
		while (true) {
			int i = (int) ((Math.random() * 6) + 1);
			int z = (int) ((Math.random() * 6) + 1);
			
			 System.out.println("( " + i + " , " + z + " )");
			 int sum = i + z;
					 if (sum == 5) {
						 break;
			}
			
		} // end of while
		try {
			Thread.sleep(500);
			} catch (InterruptedException e) {
			e.printStackTrace();}
	}// end of method
} // end of class
