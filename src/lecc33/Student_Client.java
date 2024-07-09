package lecc33;

public class Student_Client {
	public static void main(String[] args) {
		Student s= new Student();
		s.name="kaju";
		s.age=19;
		System.out.println(s.name);
		System.out.println(s.age);
		s.Intro_yourSelf();
		Student s1=new Student();
		s1.name="kunal";
		s1.age=22;
		s1.Intro_yourSelf();
		s1.SayHey("raju");
		Student.mentor_Name();
//		s1.mentor_Name();//gives warning
	}
}
