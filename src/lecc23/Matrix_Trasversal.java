package lecc23;

public class Matrix_Trasversal {
// 	reach right bottom in matrix
	public static void main(String[] args) {
		int m=3;
		int n=4;
		printpath(m,n,1,1,"");

	}
	public static void printpath(int m,int n,int curr_m,int curr_n,String ans) {
		if(curr_m==m && curr_n==n) {
			System.out.println(ans);
			return;
		}
		if(curr_m > m ||curr_n >n) {
			return;
		}
		printpath(m,n,curr_m+1,curr_n,ans+"H");
		printpath(m,n,curr_m,curr_n+1,ans+"V");
	}

}
