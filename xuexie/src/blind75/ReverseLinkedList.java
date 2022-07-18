package blind75;



public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		
		ReverseLinkedList rll = new ReverseLinkedList();
		ListNode result = rll.reverseList(head);
		System.out.println("Linkedlist " + result);
		
	}
	
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		
		while(curr!=null) {
			ListNode next = curr.next;
			curr.next= prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}
