package my.spring.main;

public class MyImplementationBean extends MyAbstractBean {

	@Override
	public void displayName() {
		System.out.println(getName());
	}

}
