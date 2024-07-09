package lec02;

public class pattern8 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=n) {
				if(row==i|| row+i==n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
				i++;
			}
			row++;
			System.out.println();
		}

	}

}
