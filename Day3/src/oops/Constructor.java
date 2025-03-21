package oops;
class Car{
	int count;
	String Brand ;
	String color;
	
	
	Car(int count,String color,String Brand){
		this.count=count;
		this.color=color;
		this.Brand=Brand;
	}
		void display() {
			System.out.println("Car Model Is " +Brand);
			System.out.println("Car Color Is " +color);
			System.out.println("Car Count Is " +count);
		}
	
	}

public class Constructor {
	public static void main(String[] args) {
		Car c1 = new Car(2,"BLack","BMW");//Default Constructor
		
		c1.display();
		
		
	}
}
