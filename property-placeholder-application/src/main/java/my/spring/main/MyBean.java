package my.spring.main;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBean {

	@Autowired
	public int id;
	@Autowired
	public String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
