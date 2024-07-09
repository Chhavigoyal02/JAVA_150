	package lecc22;

public class SubSequence {

	public static void main(String[] args) {
		String ques = "aab";
//		print(ques, "");
		System.out.println("\n"+count(ques,""));
	}

	public static void print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		print(ques.substring(1), ans); // not character added
		print(ques.substring(1), ans + ch); // character added
	}

	public static int count(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans+"   ");
			return 1;
		}
		char ch = ques.charAt(0);
		int a = count(ques.substring(1), ans); // not character added
		int b = count(ques.substring(1), ans + ch); // character added
		return a + b;
	}
}
