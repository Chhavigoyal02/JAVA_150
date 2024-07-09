package lecc30;

public class Prime_Sieve {

	public static void main(String[] args) {
		int n = 100; 
		Prime_Sieve(n);
	}
	public static void Prime_Sieve(int n) {
		boolean[] prime = new boolean[n+1];
		prime[0] = true;//not prime(true mtlb non prime and false mtlb prime and array m default se false bhara hua h)
		prime[1]= true;//not prime
		for(int i=2;i*i<=prime.length;i++) {
			if(prime[i] == false) {//prime
				for(int j=2;i*j<prime.length;j++) {
					prime[i*j]= true;
				}
			}
		}
		for(int i=2;i<prime.length;i++) {
			if(prime[i]==false) {
				System.out.print(i+" ");
			}
		}
	}
}