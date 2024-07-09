package lecc16;

public class String_Compare {

	public static void main(String[] args) {
		String s1="raj";
		String s2="rajesh";
		System.out.println(s1.compareTo(s2));// sare character match kr gye to length ka difference bta diya
		String s3="Kunal";
		String s4="Komal";
		System.out.println(s3.compareTo(s4));//here ascii value ka diff 
		System.out.println(compareTo(s1,s2));
	}
	public static int compareTo(String s1,String s2) {
		int n=Math.min(s1.length(), s2.length());
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		return s1.length()-s2.length();
	}
}
