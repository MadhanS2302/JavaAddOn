package oops;
class Book{
	int bookid;
	String title;
	String author;
	double price;
	
	Book(int bookid,String title,String author,double price){
		this.bookid=bookid;
		this.title=title;
		this.author=author;
		this.price=price;
		
		
	}
	void display() {
		System.out.println("\t****************");
		System.out.println("BookId " +bookid);
		System.out.println("Title " +title);
		System.out.println("Author " +author);
		System.out.println("Price " +price);
	}
}

public class Library {
	public static void main(String[] args) {
		Book b1 =new Book(100,"C++","Guru",50000);
		Book b2 =new Book(101,"Python","Guru",50000);
		Book b3 =new Book(102,"Java","Guru",50000);
		System.out.println("\t Library");
		b1.display();
		b2.display();
		b3.display();
		
		
	}

}
