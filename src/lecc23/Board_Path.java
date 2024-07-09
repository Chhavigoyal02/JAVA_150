package lecc23;

public class Board_Path {

	public static void main(String[] args) {
		int n = 5;
//		PrintPath(n, 0, "");
		PrintPathFacesByUser
		(n, 0, "");

	}

//	public static void PrintPath(int n, int curr, String ans) {
//		if (curr == n) {
//			System.out.println(ans);
//			return;
//		}
//		if (curr > n) {
//			return;
//		}
//		PrintPath(n, curr + 1, ans + 1);
//		PrintPath(n, curr + 2, ans + 2);
//		PrintPath(n, curr + 3, ans + 3);
//	}
	
	public static void PrintPathFacesByUser(int n, int curr, String ans) {
		if (curr == n) {
			System.out.println(ans);
			return;
		}
		if (curr > n) {
			return;
		}
		for(int dice = 1;dice<=3;dice++) {
			PrintPathFacesByUser(n,curr+dice,ans+dice);
		}
	}

}
