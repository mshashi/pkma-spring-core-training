package my.spring.main;

public class EmployeeUsingAutowired {

	public int employeeId = 1340;
	
	private Address empAddress;

	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}
	
	public EmployeeUsingAutowired(){
		
	}
	
	public EmployeeUsingAutowired(Address empAddress){
		this.empAddress = empAddress;
	}
}
