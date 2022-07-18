package xuexie;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8{

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		Arrays.stream(nums).map(i -> {
		System.out.println(i*2);
		System.out.println(i);
		return i += 2;
		
		}).sum();
		for(int num : nums) {
			System.out.println(num);
		}
		
		List<String> list = Arrays.asList("a","b","c");
		Predicate<String> p = s->s.startsWith("a");
		for(String l : list) {
			if(p.test(l)) {
				System.out.println(l);
			}
		}
		list.stream().filter(s->s.startsWith("a")).forEach(System.out::print);
		System.out.println("           ");
		for(String l :list) {
			System.out.print(l);
		}
		Arrays.stream(nums).map(d->d+8).filter(d-> d<10).filter(d->d>5).forEach(System.out::println);
		Supplier<String> i = () ->"car";
		Consumer<String> c = x-> System.out.println(x.toLowerCase());
		Consumer<String> d = x-> System.out.println(x.toUpperCase());
		c.andThen(d).accept(i.get());
		list.stream().map(s->s+"cc").filter(z->!z.isEmpty()).forEach(System.out::println);
	}

}
