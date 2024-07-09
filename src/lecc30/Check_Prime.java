package lecc30;

public class Check_Prime {

	public static void main(String[] args) {
		int n = 89;
		System.out.println(checkPrime(n));
	}
	public static boolean checkPrime(int n) {
		int div = 2;
		while(div*div<=n) {
			if(n%div==0) {
				return false;
			}
			div++;
		}
		return true;
	}
}
