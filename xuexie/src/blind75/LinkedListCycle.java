package blind75;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		System.out.println("Linkedlist " + hasCycle(head));
		head.next.next.next.next.next = head.next.next;
		System.out.println("Linkedlist " + hasCycle(head));
		
		

	}
	
	public static boolean hasCycle(ListNode head) {
		
//		ListNode slow = head;
//		ListNode fast = head;
//		while(fast != null && fast.next !=null) {
//			slow = slow.next;
//			fast= fast.next.next;
//			if(slow== fast) {
//				return true;
//			}
//		}
//		return false;
		   Set<ListNode> nodesSeen = new HashSet<>();
	        while (head != null) {
	            if (nodesSeen.contains(head)) {
	                return true;
	            }
	            nodesSeen.add(head);
	            head = head.next;
	        }
	        return false;
		
		
		
	}
	
	
	
	
	

}

