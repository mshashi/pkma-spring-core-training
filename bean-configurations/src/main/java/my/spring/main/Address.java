package my.spring.main;

public class Address {

	public String address = "This is the address String";
	
	public void myInit(){
		System.out.println("This is the init method in Address class");
	}
	
	public void myDestroy(){
		System.out.println("I am destroyed -- Address");
	}
	
}
