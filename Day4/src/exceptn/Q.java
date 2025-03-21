package exceptn;
import java.util.*;


public class Q {

	public static void main(String[] args) {
		Queue<Integer> q1 = new ArrayDeque<>();
		q1.add(100);
		q1.add(200);
		q1.add(300);
		System.out.println(q1);
		System.out.println(q1.peek()); //peek is used to find the head

	}

}
