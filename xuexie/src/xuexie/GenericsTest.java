package xuexie;

public class GenericsTest {
	
	
	static public <T super BaseA> void printGeneric(T instance) {
		instance.printInstanceName();
	}

	public static void main(String[] args) {
		BaseA baseA = new BaseA("BaseA-1");
		ParentA parentA = new ParentA("ParentA-5");
		printGeneric(parentA);
		printGeneric(baseA);
		

	}

}
