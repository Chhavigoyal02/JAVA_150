package lec05;

public class func_demo_3 {
static int val=100;
	public static void main(String[] args) {
		System.out.println("hey");
		int a=8;
		int b=7;
		System.out.println(val);
		System.out.println(Add(a,b));
		System.out.println(val);

	}
	public static int Add(int a,int b) {
		int c=a+b;
		int x=Sub(a,c);
		int val=90;
		val=val+5;
		return x+c;
	}
	public static int Sub(int a,int b) {
		return a-b;
	}
}
