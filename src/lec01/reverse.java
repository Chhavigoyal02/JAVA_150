package lec01;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2348;
		int t,rev=0;
		while(n>0) {
			t=n%10;
			rev=rev*10+t;
			n=n/10;
		}
		System.out.println(rev);
	}
}
