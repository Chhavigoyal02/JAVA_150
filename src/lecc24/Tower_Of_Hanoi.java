package lecc24;

public class Tower_Of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		String src = "A";
		String hlp = "B";
		String des = "C";
		TOH(n, src, hlp, des);
	}

	public static void TOH(int n, String src, String hlp, String des) {
		if (n == 0) {
			return;
		}
		TOH(n - 1, src, des, hlp);//ye wala recursion movement number 3 tk le jayga mtlb saare n-1 disk helper m hoge.
		System.out.println("Move " + n + "th disk from " + src + " to " + des);
		TOH(n - 1, hlp, src, des);
	}
}
