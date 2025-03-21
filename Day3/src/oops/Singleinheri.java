package oops;
class Animal{
	void sound() {
		System.out.println("Animals Mkae Sound");
	}
	
}

class Dog extends Animal{
	void noise() {
	
	
	System.out.println("Dogs Bark");
	}
}

class fish extends Dog{
	void swim() {
		System.out.println("Fish Is Swiming");
	}
}
public class Singleinheri {
public static void main(String[] args) {
	fish d1=new fish();
	d1.sound();
	d1.noise();
	d1.swim();
	
}
}
