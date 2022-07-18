package blind75;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
	
		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(3);
		head2.next.next = new ListNode(3);
		head2.next.next.next = new ListNode(4);
		head2.next.next.next.next = new ListNode(4);
		head2.next.next.next.next.next = new ListNode(6);
	
		MergeTwoSortedLists msl = new MergeTwoSortedLists();
		System.out.println("Linkedlist " + msl.mergeTwoSortedLists(head, head2));
	}

	public ListNode mergeTwoSortedLists(ListNode list1, ListNode list2) {

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
		if (list2 != null) {
			tail.next = list2;
		}
		if (list1 != null) {
			tail.next = list1;
		}

		return dummy.next;

	}
}