package demoForD2H1;

public class User {
	public User() {
		System.out.println("User+");
	}
	
	public User(int id,String name) {
		this();
		this.id=id;
		this.name=name;
		
	}
	int id;
	String name;

}
