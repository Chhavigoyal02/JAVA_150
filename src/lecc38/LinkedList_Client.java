package lecc38;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception{
		LinkedList ll =new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addatindex(2, 50);
		ll.display();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.getatindex(3));
	}

}
