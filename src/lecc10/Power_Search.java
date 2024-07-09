package lecc10;

public class Power_Search {

	public static void main(String[] args) {
		int k=3;
		int n=146;
		int num=1;
		for(int i=1;i<n;i++) {
			int pow=(int)(Math.pow(i,k));
			if(pow<=n) {
				num=i;
			}
		}
		System.out.println(num);
		
		
	}

}
