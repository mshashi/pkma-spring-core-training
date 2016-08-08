package my.spring.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	 public static void main(String[] args) {

	      AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-beans.xml");

	      MyBean myBean = (MyBean) context.getBean("myBean");
	      myBean.getMessage();
	      context.registerShutdownHook();
	   }
}
