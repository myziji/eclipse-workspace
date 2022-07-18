package blind75;

public class ListNode {
    int value = 0;
    ListNode next;

     ListNode(int value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return String.format("(%d, next = %s) ",value, next);
    }
    
}
