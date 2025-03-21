package exceptn;

public class Throw{
	static void checkAge(int age) {
		if (age<18) {
			throw new IllegalArgumentException("Age must be 18 or Older");
		}
		System.out.println("Access Granted");
			
		}
		
	

	public static void main(String[] args) {
		try {
			checkAge(19);
		}catch(IllegalArgumentException e) {
			System.out.println("Exception caught"+e.getMessage());
		}
	
	}
}
