package exceptn;
class candy{
	void taste() {
		System.out.println("tasty sweet");
	}
}
class Chocolate extends candy{
	void taste() {
		super.taste();
		System.out.println("tasty chocolate");
	}
}

public class Task3 {

	public static void main(String[] args) {
		Chocolate g1 = new Chocolate();
		g1.taste();
	}

}
