package lec01;

public class digits_sum {

	public static void main(String[] args) {
		int n=2348;
		int t,sum=0;
		while(n>0) {
			t=n%10;
			sum=sum+t;
			n=n/10;
		}
		System.out.println(sum);
	}

}
