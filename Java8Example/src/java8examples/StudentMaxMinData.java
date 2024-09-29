package java8examples;

public class StudentMaxMinData {
	private String name;
	private int age;
	private int sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public StudentMaxMinData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public StudentMaxMinData(String name, int age, int sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

	
	
	
}
