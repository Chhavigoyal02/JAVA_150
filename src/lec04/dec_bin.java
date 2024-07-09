package lec04;
import java.util.*;
public class dec_bin {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		// decimal to binary
		int sum=0,mul=1;
		while(n>0) {
			int rem = n%2;
			sum = sum + rem*mul;
			n=n/2;
			mul = mul * 10;
		}
		System.out.println(sum);
	}

}