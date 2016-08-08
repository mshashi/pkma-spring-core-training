package my.spring.main;

public abstract class MyAbstractBean {

	private String name;
	
	public abstract void displayName();

	protected String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
