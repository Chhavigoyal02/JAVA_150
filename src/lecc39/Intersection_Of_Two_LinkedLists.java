package lecc39;

import lecc39.Linked_List_Cycle.ListNode;

public class Intersection_Of_Two_LinkedLists {
	public class solution{
		public ListNode getIntersectionNode(ListNode headA,ListNode headB) {
			ListNode a=headA;
			ListNode b=headB;
			while(a!=b) {
				if(a==null) a=headB;
				else a=a.next;
				if(b==null) b=headA;
				else b=b.next;
			}
			return b;
		}
	}
}
