package lecc37;
import java.util.*;
public class Stock_Span_Stack {

	public static void main(String[] args) {
		int[] arr= {3,1,6,4,18,7,5,11,19};
		Stack<Integer> st=new Stack<>();
		int[] ans=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			while(!st.empty()&&arr[i]>=arr[st.peek()]) {
				st.pop();
			}
			if(!st.empty()) {
				ans[i]=i-st.peek();
			}
			else {
				ans[i]=i+1;
			}
			st.push(i);
		}
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}

	}

}
