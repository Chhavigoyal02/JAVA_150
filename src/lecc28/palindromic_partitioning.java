package lecc28;

import java.util.ArrayList;
import java.util.List;

public class palindromic_partitioning {

	public static void main(String[] args) {
		String ques = "nitin";
		List<String> ll = new ArrayList<>();
		List<List<String>> ans= new ArrayList<>();
		Partition(ques, ll,ans);
		System.out.println(ans);
	}

	public static void Partition(String ques,List<String> ll,List<List<String>> ans) {
		if (ques.length() == 0) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);
			if (isPalindrome(s)) {
				ll.add(s);
				Partition(ques.substring(i), ll,ans);
				ll.remove(ll.size()-1);
			}
		}
	}

	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		while (left <= right) {
			if (s.charAt(right) != s.charAt(left)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
