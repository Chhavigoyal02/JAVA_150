package lecc25;

import java.util.List;
import java.util.ArrayList;
public class Key_Pad {
	static String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		String ques = "23";
		List<String> ll = new ArrayList<>();
		keyPad(ques, "",ll);
		System.out.println(ll);
	}

	public static void keyPad(String ques, String ans,List<String> ll) {// 23,-
		if (ques.length() == 0) {
			ll.add(ans);
			return;
		}
		char ch = ques.charAt(0);// 2
		String press = map[ch - '0'];// abc
		for (int i = 0; i < press.length(); i++) {
			keyPad(ques.substring(1), ans + press.charAt(i),ll);
		}
	}
	
}
