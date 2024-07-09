package lec05;

public class func_demo_2 {

	public static void main(String[] args) {
		System.out.println("hey");
		Add();
	}
	public static int Add() {
		int a=9;
		int b=7;
		Sub();
		int c=a+b;
		return c;
	}
	public static void Sub() {
		int a=9;
		int b=7;
		System.out.println(a-b);
	}

}
