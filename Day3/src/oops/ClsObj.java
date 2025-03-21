package oops;
import java.util.*;
class Student{
	String name;
	int rollnumber;
	String dept;
	
	void displayData() {
		System.out.println("Name Is"+name);
		System.out.println("RollNumber Is"+rollnumber);
		System.out.println("Department  Is"+dept);
		
		
	}
}
public class ClsObj {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name="MadhanS";
		s1.rollnumber=222;
		s1.dept="Msc.ss";
		System.out.println("Name Is"+s1);
		
		s1.displayData();
	}

}
