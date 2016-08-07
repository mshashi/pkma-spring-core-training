package my.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext springContext = new ClassPathXmlApplicationContext("application-beans.xml");
		Employee employee = (Employee)springContext.getBean("myEmployee");
		System.out.println(employee.employeeId);
		System.out.println(employee.empAddress.address);
	}

}
