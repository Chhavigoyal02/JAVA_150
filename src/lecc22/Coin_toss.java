package lecc22;

public class Coin_toss {

	public static void main(String[] args) {
		int n = 3;
//		Print(n, "");
		
		print_not_seq_head(n, "");
		
	}

	public static void Print(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		Print(n - 1, ans + "H");
		Print(n - 1, ans + "T");
	}
	public static void print_not_seq_head(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			print_not_seq_head(n - 1, ans + "H");
		}
		print_not_seq_head(n - 1, ans + "T");
	}
}
