package oops;

public class Method { 
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static void main(String[] args) {
		System.out.println("Addition Is " +add(100,200));
		System.out.println("Subtraction  Is " +sub(200,100));
		
	}
}
