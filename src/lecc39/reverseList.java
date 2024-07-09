package lecc39;

import lecc39.Linked_List_Cycle.ListNode;

public class reverseList {
	class Solution{
		public ListNode reverseList(ListNode head) {
			ListNode prev=null;
			ListNode curr=head;
			while(curr!=null) {
				ListNode ahead=curr.next;
				curr.next=prev;
				prev=curr;
				curr=ahead;
			}
			return prev;
		}
	}
}