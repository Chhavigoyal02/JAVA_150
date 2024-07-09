package lecc38;

public class LinkedList {
	class Node {
		int val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void addFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	// O(N)
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	// O(1)
	public void addLast(int item) {
		if (size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	// O(1)
	public int getFirst() {
		return head.val;
	}

	// O(1)
	public int getLast() {
		return tail.val;
	}

	// O(N)
	public int getatindex(int k) throws Exception {
		return GetNode(k).val;
	}

	// O(N)
	public Node GetNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("k range m de!!");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// O(N)
	public void addatindex(int k, int item) throws Exception {
		if (k == 0) {
			addFirst(item);
		} else if (k == size) {
			addLast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node temp = GetNode(k - 1);
			nn.next = temp.next;
			temp.next = nn;
			size++;
		}
	}
	public int removefirst() {
		Node temp=head;
		if(size==1) {
			head=null;
			tail=null;
			size--;
		}
		else {
			head=head.next;
			temp.next=null;
			size--;
		}
		return temp.val;
	}
	//O(1)
	public int removelast() throws Exception {
		if(size==1) return removefirst();
		else {
			Node prev=GetNode(size-2);
			int rv=tail.val;
			tail=prev;
			tail.next=null;
			size--;
			return rv;
		}
	}
	//O(N)
	public int removeatindex(int k) throws Exception{
		if(k==0) {
			return removefirst();
		}
		else if(k==size-1) {
				return removelast();
		}
		else {
			Node pre=GetNode(k-1);
			Node curr=GetNode(k);
			pre.next=curr.next;
			curr.next=null;
			size--;
			return curr.val;
		}
	}
}
