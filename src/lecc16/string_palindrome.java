package lecc16;

public class string_palindrome {

	public static void main(String[] args) {
		String s=" ";
		int left=0;
		int right=s.length()-1;
		while(left<=right) {
			if(s.charAt(right)!=s.charAt(left)) {
				System.out.println("not");
				left++;
				right--;
			}
		}
	}

}
