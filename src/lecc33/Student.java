package lecc33;

public class Student {

	String name;
	int age;
	
	public void Intro_yourSelf() {
		System.out.println("My name is "+this.name+" and age is "+this.age);
	}

	public void SayHey(String name) {
		System.out.println(this.name+" say hey "+name);
	}
	public static void mentor_Name() {//idhr static lga diya h mtlb ye 
		//object pr depend nhi krra h sb members ke liye common answer h
		System.out.println("Mentor Name xyz");
	}
}
