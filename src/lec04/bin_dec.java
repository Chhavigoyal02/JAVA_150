package lec04;
import java.util.*;
public class bin_dec {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		//binary to decimal
		int sum=0,mul=1;
		while(n>0) {
			int rem = n%10;
			sum = sum + rem*mul;
			n=n/10;
			mul = mul * 2;
		}
		System.out.println(sum);
	}

}
