package lec02;

public class pattern7 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int star=n;
		while(row<=n) {
			int j=1;
			while(j<=star) {
				if(row==1 || row==n || j==1 || j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				j++;
			}
			row++;
			System.out.println();
		}

	}

}
