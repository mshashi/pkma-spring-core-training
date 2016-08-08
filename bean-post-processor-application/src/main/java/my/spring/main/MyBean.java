package my.spring.main;

public class MyBean {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Message : " + message);
	}

	public void init() {
		System.out.println("In init methood.");
	}

	public void destroy() {
		System.out.println("In destroy method.");
	}

}
