package oops;
class Data{
	private String name;
	//Getter Method
	public String getName() {
		
	return name; 
}


public void setName(String name) {
	if(name!= null && !name.isEmpty()) {
		this.name=name;
		
	}else {
		System.out.println("Invalid Name");
	}
}
}

public class GetterAndSetter {
	public static void  main(String[] args) {
		Data d = new Data();
		d.setName("MadhanS");
		System.out.println("My Name Is " +d.getName());
		
	

}
}