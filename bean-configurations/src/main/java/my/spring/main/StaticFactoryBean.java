package my.spring.main;

public class StaticFactoryBean {
private static StaticFactoryBean staticFactoryBean = new StaticFactoryBean();

public String welcomeMessage = "We have just created a static factory bean.";

private StaticFactoryBean(){
	
}

public static StaticFactoryBean createInstance(){
	return staticFactoryBean;
}

}
