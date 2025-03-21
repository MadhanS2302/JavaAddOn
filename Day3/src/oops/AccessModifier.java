package oops;
class Stu{
	public String Name = "Raj";
	private int age = 20;
	protected String grade = "A";
	String school = "ABC School";
	
	
	
	public void display() {
		System.out.println(""+Name);
		System.out.println(""+age);
		System.out.println(""+grade);
		System.out.println(""+school);
		
		
	}
	
}
public class AccessModifier {

	public static void main(String[] args) {
		
		Stu s1 = new Stu();
		s1.display();
		
		System.out.println("Public Name"+s1.Name);
		System.out.println("Default Name"+s1.school);
		
	}

}
