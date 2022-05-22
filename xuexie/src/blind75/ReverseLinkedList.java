package blind75;



public class ReverseLinkedList {
		
	  Node head;
	  
	 class Node{
		 int data;
		 Node next;
		 Node(int d){
			 data = d;
			 next =null;
		 }
	 }
	   
	 public void push(int new_data)
	    {
	        Node new_node = new Node(new_data);
	        new_node.next = head;
	        head = new_node;
	    }
	
	
	public void printList() {
		Node tnode =head;
		while(tnode != null) {
			System.out.println(tnode.data + " ");
			tnode = tnode.next;
		}
	}
	
	public Node reverselist(Node head) {
		Node prevNode = null;
		Node currNode = head;
		
		while(currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		return prevNode;
	}
	public static void main(String[] args) {
		
		ReverseLinkedList list = new ReverseLinkedList();
//		list.push(7);
//		list.push(1);
//		list.push(3);
//		list.push(2);
//		list.printList();
		list.push(2)
		//list1.next = new Node(4);
		list.next.next = new Node(6);
		list1.next.next.next = new Node(8);
		list1.next.next.next.next = new Node(10);
		
//		list.reverselist(list1);
//		list.printList();
		
		
		
	}



	

}
