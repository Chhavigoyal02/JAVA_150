package lec02;
import java.util.*;
public class pattern22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int row=1;
		int star=5;
		int space=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int k=2;
			while(k<space) {
				System.out.print("  ");
				k++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			row++;
			star--;
			space+=2;
			System.out.println();
		}
	}

}
