package oops;
interface camera{
	void capture();
	}
interface Flashlight{
	void on();
	
}
class Phone implements camera,Flashlight{

	@Override
	public void on() {
		System.out.println("Flash Flash");
		
	}

	@Override
	public void capture() {
		System.out.println("Smile Please");
		
	}
	
}
public class Multiple {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.on();
		p1.capture();
		

	}

}
