package blind75;

public class ReorderList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		//head.next.next.next.next.next = new ListNode(6);
		ReorderList ro= new ReorderList();
		ListNode result =ro.reorderList(head);
		System.out.print(result);
		
	}

	public ListNode reorderList(ListNode head) {
		
		ListNode slow =head;
		ListNode fast =head.next;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode second = slow.next;
		ListNode prev = null;
		slow.next= null;
		while(second!=null) {		
			ListNode temp = second.next;
			second.next = prev;
			prev = second;
			second= temp;
		}
		second = prev;
		ListNode result = new ListNode(0);
		ListNode temp = result;
		while(head!=null && second!=null) {
			temp.next = head;
			head = head.next;
			temp.next.next=second;
			second = second.next;
			temp.next.next.next=null;
			result = temp.next;
			temp = new ListNode(0);
			
		}
		if(head!=null) {
			result.next = head;
		}
		if(prev!=null) {
			result.next = prev;
		}
		
		
        return result.next;
    }
	
}

