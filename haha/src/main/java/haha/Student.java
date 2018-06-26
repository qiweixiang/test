package haha;

public class Student {

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address="
				+ address + "]";
	}

	private String name = "ÆîÎ°Ïé";
	
	private String age =  "25";
	
	private Object address;



	public Object getAddress() {
		return address;
	}

	public void setAddress(Object address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}



	
}
