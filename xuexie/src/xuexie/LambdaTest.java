package xuexie;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTest {

	public static void main(String[] args) {
		List<String> listStrings = Arrays.asList("Geeks","QA","GeeksForQuiz","goo","bar");
		Predicate<String> p = (s)-> s.startsWith("G");
		for(String st:listStrings) {
			if(p.test(st)) {
				System.out.print(st);
			}
		}
	}

}
