package my.spring.main;

public class Employee {

	public int employeeId = 1340;
	public Address empAddress;
	
	
	//This is invoked when creating a bean with setter-based
	public Employee(){
		System.out.println("This is ID is being displayed in the Employee class: "+this.employeeId);
	}
	
	//This is invoked when creating a bean with constructor-based
	public Employee(final Address empAddress){
		//This empAddress is set when using constructor-based injection
		this.setEmpAddress(empAddress);
	}

	//This empAddress is set when using setter-based
	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}
	
}
