package LeetCode;

public class LeetCode83 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);

		LeetCode83 lc = new LeetCode83();
		ListNode result = lc.deleteDuplicates(head);
		System.out.println("Linkedlist " + result);

	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode temp = head;
		while (temp != null && temp.next != null) {
			if (temp.value == temp.next.value) {
				temp.next = temp.next.next;
			} 
			else {
				temp = temp.next;
			}

		}
		return head;
	}
}
