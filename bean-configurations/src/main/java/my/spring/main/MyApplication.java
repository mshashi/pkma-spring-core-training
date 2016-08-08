package my.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

	/**
	 * Main method for showing init-method and destroy-method.
	 */
//	public static void main(String[] args) {
//		ConfigurableApplicationContext springContext = new ClassPathXmlApplicationContext("application-beans.xml");
//		springContext.registerShutdownHook();
//		Employee employee = (Employee)springContext.getBean("myEmployee");
//		System.out.println(employee.employeeId);
//		System.out.println(employee.empAddress.address);
//
//	}
	
	
	/**
	 * Main method for showing singleton and prototype scope.
	 * @param args
	 */
//	public static void main(String[] args) {
//		ApplicationContext springContext = new ClassPathXmlApplicationContext("application-beans.xml");
//		Address empAddress1 = (Address)springContext.getBean("empAddress");
//		System.out.println(empAddress1.address);
//		empAddress1.address = "This is not my address";
//
//		Address empAddress2 = (Address)springContext.getBean("empAddress");
//		System.out.println(empAddress2.address);
//		
//	}
	
	/**
	 * Static Factory invocation
	 * @param args
	 */
//	public static void main(String[] args) {
//		ApplicationContext springContext = new ClassPathXmlApplicationContext("application-beans.xml");
//		
//		StaticFactoryBean staticFactoryBean = (StaticFactoryBean)springContext.getBean("staticFactoryBean");
//		System.out.println(staticFactoryBean.welcomeMessage);
//		
//	}
	
	/**
	 * Instance factory invocation
	 * @param args
	 */
//	public static void main(String[] args) {
//		ApplicationContext springContext = new ClassPathXmlApplicationContext("application-beans.xml");
//		
//		InstanceFactoryBean instanceFactoryBean = (InstanceFactoryBean)springContext.getBean("myInstanceFactoryBean");
//		System.out.println(instanceFactoryBean.welcomeMessage);
//		
////		InstanceFactoryBean instanceFactoryBeanWithArgument = (InstanceFactoryBean)springContext.getBean("myInstanceFactoryBeanWithArgument");
////		System.out.println(instanceFactoryBeanWithArgument.welcomeMessage);
//		
//	}
	
	/**
	 * Autowiring demo
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext springContext = new ClassPathXmlApplicationContext("application-beans.xml");
		
//		Employee employeeBean = (Employee)springContext.getBean("myEmployee");
		EmployeeUsingAutowired employeeBean = (EmployeeUsingAutowired)springContext.getBean("myEmployee");
		System.out.println(employeeBean.getEmpAddress().address);
		
		
	}
	
	

}
