package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode160 {

	public static void main(String[] args) {
		ListNode headA = new ListNode(4);
		headA.next = new ListNode(1);
		headA.next.next = new ListNode(3);
		
		ListNode headB = new ListNode(5);
		headB.next = new ListNode(6);
		headB.next.next = new ListNode(1);

		ListNode headC = new ListNode(8);
		headC.next = new ListNode(4);
		headC.next.next = new ListNode(5);

		//headA.next.next = headC;
		//headB.next.next = headC;

		LeetCode160 lc = new LeetCode160();
		System.out.print(lc.getIntersectionNode(headA, headB));

	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//		Set<ListNode> set = new HashSet<ListNode>();
//		while (headB != null) {
//			set.add(headB);
//			headB = headB.next;
//
//		}
//
//		while (headA != null) {
//			if (set.contains(headA)) {
//				return headA;
//			}
//			headA = headA.next;
//
//		}
//		return null;
		ListNode a = headA;
        ListNode b = headB;
		while(a!=b){
            if(a != null) {
            	a = a.next;
            }
            else {
            	a = headB;
            }
            if(b != null) {
            	b = b.next;
            }
            else {
            	b = headA;
            }
        }
		return a;
	}
}
