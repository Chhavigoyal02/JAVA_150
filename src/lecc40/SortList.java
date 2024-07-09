package lecc40;

import lecc39.Linked_List_Cycle.ListNode;

public class SortList {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	public class solution{
		public static ListNode sort(ListNode head) {
			if(head==null || head.next==null) return head;
			ListNode mid=middle(head);
			ListNode headB = mid.next;
			mid.next=null;
			ListNode A=sort(head);
			ListNode B=sort(headB);
			return mergeTwoLists(A,B);
		}
		public static ListNode middle(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;
		}
		public static ListNode mergeTwoLists(ListNode list1,ListNode list2) {
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
