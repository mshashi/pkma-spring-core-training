package my.spring.main;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BeanPostProcessorImpl implements BeanPostProcessor, Ordered{

	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In post process after initialization");
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In post process before initialization");
		return bean;
	}
	public int getOrder() {
		return 0;
	}

}
