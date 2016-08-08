package my.spring.main;

public class InstanceFactoryBean {
	private static InstanceFactoryBean instanceFactoryBean = new InstanceFactoryBean();

	public String welcomeMessage = "We have just created a instance factory bean.";

	private InstanceFactoryBean(){
		
	}

	public InstanceFactoryBean createInstance(){
		return instanceFactoryBean;
	}
	
//	public InstanceFactoryBean createInstanceWithArgument(String welcomeMessage){
//		instanceFactoryBean.welcomeMessage = welcomeMessage;
//		return instanceFactoryBean;
//	}

}
