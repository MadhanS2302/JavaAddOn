package exceptn;
class pet{
	void brag() {
		System.out.println("I have the best pet");
	}
}
class dog extends pet{
	void brag() {
		super.brag();
		System.out.println("I have the best dog");
	}
}

public class Task5 {

	public static void main(String[] args) {
		dog g1 = new dog();
		g1.brag();
	}

}
