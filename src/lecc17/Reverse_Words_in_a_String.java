package lecc17;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		String s=" a good   example ";
		System.out.println(reverseWords(s));

	}
	public static String reverseWords(String s) {
		s=s.trim();
		String[] arr=s.split("\s+"); //split kr dega white spaces pr or + isliye qki multiple spaces h
		String ans="";
		for(int i=arr.length-1;i>=0;i--) {
			ans=ans+arr[i]+" ";
		}
		return ans.trim();
	}

}
