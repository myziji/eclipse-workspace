package xuexie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Sorter {

	public static void main(String[] args) {
		
			Consumer<Namer> printit = e -> System.out.println(e.getFirstName()+""+e.getLastName());
			List<Namer> names = new ArrayList(Arrays.asList(new Namer("Harry","Smith",new Namer("Joe","Smith",new Namer("Jane","Doe"),new Namer("Marry","Jane"),new Namer("Harry","Homeowner")))));
		

	}

}
