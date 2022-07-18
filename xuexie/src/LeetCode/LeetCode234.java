package LeetCode;

import java.util.Stack;

public class LeetCode234 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
		LeetCode234 lc = new LeetCode234();
		System.out.print(lc.isPalindrome(head));
	}

	public boolean isPalindrome(ListNode head) {
		ListNode curr = head;
		Stack<ListNode> stack = new Stack<>();
		while (curr != null) {
				stack.push(curr);
				curr = curr.next;
		}
		while(head!=null ||!stack.isEmpty()) {
			ListNode temp = stack.pop();
			if(temp.value!= head.value) {
				return false;
			}
			head = head.next;
		}
		return true;
	}
}
