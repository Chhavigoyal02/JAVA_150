package lecc34;

public class Person {
	private String name = "Raj";
	private int age = 18;
	
	public Person(String name,int age) {
		this.name = name;
		this.age=age;
	}

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
		try {
			if(age<0) {
				throw new Exception("age -ve nhi hoti ");
			}
			this.age = age;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finally block");
		}
	}
} 
