package my.spring.main;

public class Employee {

	public int employeeId = 1340;
	public Address empAddress;
	
	
	//This is invoked when creating a bean with properties
	public Employee(){
		
	}
	
	//This is invoked when creating a bean with constructor-arguments
	public Employee(final Address empAddress){
		//This empAddress is set when using constructor-argument injection
		this.setEmpAddress(empAddress);
	}

	//This empAddress is set when using property placeholder
	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}
	
}
