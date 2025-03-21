package exceptn;

class Dog{
	void bark() {
		System.out.println("Dog is barking");
	}
}

class Cat extends Dog{
	void meow(){
	System.out.println("Cat is meoww...");
}
}

public class Task2 {

	public static void main(String[] args) {
		Cat d1 = new Cat();
		d1.bark();
		d1.meow();
		

	}

}
