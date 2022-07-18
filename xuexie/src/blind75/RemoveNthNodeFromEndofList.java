package blind75;

public class RemoveNthNodeFromEndofList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
//		head.next.next.next.next.next = new ListNode(6);
		RemoveNthNodeFromEndofList nn = new RemoveNthNodeFromEndofList();
		ListNode result = nn.removeNthFromEnd(head, 1);
		System.out.print(result);
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		
	
		
		ListNode dummy = new ListNode(0);
		if(head.next==null) {
			return dummy.next;
		}
		dummy.next = head;
		ListNode temp = new ListNode(0);
		ListNode left = dummy;
		ListNode right = head;
	
		while(n>0&& right!=null) {
			right=right.next;
			n--;
		}
		
		while(right!=null) {
			left = left.next;
			if(right.next==null) {
				temp = right;
			}
			right= right.next;
		}
		
		left.next = temp;
		//you wen ti
		
		
		return dummy.next;
	}
}
