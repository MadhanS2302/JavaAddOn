package exceptn;

class Speak{
	void talk() {
		System.out.println("Hello");
	}


void talk(String name) {
    System.out.println("Hello, " + name);
}
}


public class Overloading {
	public static void main(String[] args) {
		Speak s1=new Speak();
		s1.talk();
		s1.talk("Madhan");
		
				
	}

}
