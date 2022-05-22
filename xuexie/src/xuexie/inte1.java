package xuexie;

import java.util.ArrayList;
import java.util.List;

public interface inte1 {
	
	List<String> list = new ArrayList<>();
	
	default void eat() {
		System.out.print("meow");
	}
	static void main() {
	}
	
}
