package xuexie;


import java.util.Formatter;

public class FormatTest {

	public static void main(String[] args) {
		String stringA = "A";
		String stringB = "B";
		String stringnull =null;
		StringBuilder bufferc = new StringBuilder("C");
		Formatter fmt = new Formatter(bufferc);
		fmt.format("%s%s",stringA,stringB);
		System.out.print("Line 1 : " + fmt);
		fmt.format("%-2s%s",stringB);
		System.out.print("Line 2 : " + fmt);
		fmt.format("%b",stringnull);
		System.out.print("Line 3 : " + fmt);
		

	}

}
