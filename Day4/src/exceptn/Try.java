package exceptn;

public class Try {

	public static void main(String[] args) {
		try {
			int num = 10/0;
			
		}catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0"+e.getMessage());
			
		}finally {
			System.out.println("Execution compeletd");
		}
		

	}

}
