package LeetCode;

public class LeetCode21 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(3);
		head.next.next = new ListNode(4);

		ListNode head2 = new ListNode(2);
		head2.next = new ListNode(5);
		head2.next.next = new ListNode(6);
		LeetCode21 lc = new LeetCode21();
		System.out.print(lc.mergeTwoLists(head, head2));
	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while (list1 != null && list2 != null) {
			if (list1.value < list2.value) {
				tail.next = list1;
				list1 = list1.next;
			} else {
				tail.next = list2;
				list2 = list2.next;
			}

			tail = tail.next;
		}
		if (list1 != null) {
			tail.next = list1;
		}
		if (list2 != null) {
			tail.next = list2;
		}

		return dummy.next;
	}
}
