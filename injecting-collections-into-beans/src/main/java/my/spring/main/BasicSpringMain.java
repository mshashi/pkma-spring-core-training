package my.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicSpringMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext springContext = new ClassPathXmlApplicationContext("application-beans.xml");
		MyBean myBean = (MyBean) springContext.getBean("myBean");
		myBean.printValues();
	}

}
