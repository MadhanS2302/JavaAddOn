package oops;
class recipe{
	String recipe,quantity;
	int price;
	
	void display() {
		System.out.println("Name :" +recipe);
		System.out.println("Quantity :"+quantity);
		System.out.println("Price :"+price);
	}
}
public class Hotel {	
	public static void main(String[] args) {
		recipe r1 = new recipe();
		r1.recipe="Dosa ";
		r1.quantity="One ";
		r1.price=25;
		
		r1.display();
	}
}
