package lecc39;

import lecc39.Linked_List_Cycle.ListNode;

public class mregetwoLists {
	class Solution{
		public ListNode mergeTwoLists(ListNode list1,ListNode list2) {
			ListNode Dummy=new ListNode(-1);
			ListNode temp = Dummy;
			while(list1!=null && list2!=null) {
				if(list1.val < list2.val) {
					Dummy.next=list1;
					Dummy=Dummy.next;
					list1=list1.next;
				}
				else {
					Dummy.next=list2;
					Dummy=Dummy.next;
					list2=list2.next;
				}
			}
			if(list1==null) {
				Dummy.next=list2;
			}
			if(list2==null) {
				Dummy.next=list1;
			}
			return temp.next;
		}
	}
}
