package xuexie;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class IkmTest {

	public static void main(String[] args) {
		Helper h = new Helper();
		int data =2;
		h.bump(data);
		System.out.println(h.data + "   " + data);
		Supplier<String> i = () -> "Car";
		Consumer<String> c= x-> System.out.println(x.toLowerCase());
		Consumer<String> d= x-> System.out.println(x.toUpperCase());
		c.andThen(d).accept(i.get());
		LocalDate localDate = LocalDate.of(2015, 4, 4);
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("MMM DD,YYYY")));
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("E,MMM DD,YYYY")));
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("MM/DD/YYYY")));
	}

	static class Helper{
		private int data = 5;
		public void bump(int inc) {
			inc++;
			data = data +inc;
		}
	}
}
