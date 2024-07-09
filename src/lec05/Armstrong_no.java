package lec05;

public class Armstrong_no {

	public static void main(String[] args) {
		int n=371;
		System.out.println(IsArmstrong_Number(n));
	}
	
	public static boolean IsArmstrong_Number(int n) {
		int c=CountOfDigit(n);
		int temp=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=(int)(sum+Math.pow(rem,c));
			n=n/10;
		}
		if(sum==temp) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int CountOfDigit(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}
}
