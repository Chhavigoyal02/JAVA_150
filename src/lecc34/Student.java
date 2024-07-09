package lecc34;

public class Student {

	private String name = "Raj";
	private int age = 18;
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//constructor (no return type , iska kaam h class k data members ko initialise krna)
	public Student() {
		
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
}
