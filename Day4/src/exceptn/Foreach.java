package exceptn;
import java.util.*;
public class Foreach {

	public static void main(String[] args) {
		
		 ArrayList<Integer> arrlist = new ArrayList<>(); //Generic 
		 
		 arrlist.add(100);
		 arrlist.add(200);
		 arrlist.add(300);
		 arrlist.add(300);
		 arrlist.addLast(800);
		 arrlist.addFirst(5000);
		 
		 
		 System.out.println(arrlist.get(0));
		 System.out.println(arrlist.set(0,1000));
		 System.out.println(arrlist.get(0));
		 arrlist.remove(0);
		 
		 
		 
		 
		 
		 
		 
		 for(int i:arrlist) {
			
			 System.out.println(i);
		 }
		 
		 
		 
		 
		
//		arrlist.add("MadahanS");
//		System.out.println(arrlist);
		
	}

}
