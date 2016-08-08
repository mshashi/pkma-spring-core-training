package my.spring.main;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeUsingAutowired {

	public int employeeId = 1340;
	
	@Autowired
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
