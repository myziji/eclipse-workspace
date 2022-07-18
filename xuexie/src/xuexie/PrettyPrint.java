package xuexie;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PrettyPrint {

	public void doAction(Queue q) {
		if(q.isEmpty()) return;
		Object first = q.remove();
		doAction(q);
		System.out.print(first.toString());
	}
	
	
	
	
	public static void main(String[] args) {
		LinkedList<String> starterList = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
		PrettyPrint pp = new PrettyPrint();
		pp.doAction(starterList);

	}

}
