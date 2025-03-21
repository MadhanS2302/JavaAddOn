package oops;
class Camel{
	void sound() {
		System.out.println("Animals Mkae Sound");
	}
	
}

class Gif extends Camel{
	void noise() {
	
	
	System.out.println("Dogs Bark");
	}
}

class bat extends Camel{
	void fly() {
		System.out.println("Bat Flies At Ni8");
	}
}
public class Hier {

	public static void main(String[] args) {
		Gif d1=new Gif();
		bat b1=new bat();
		d1.noise();
	//	d1.sound();
		b1.sound();
		
		b1.fly();
		

	}

}
