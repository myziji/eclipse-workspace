package xuexie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableVSComparator implements Comparator<Movie>{

//	Comparable 	 (interface)				Comparator (FunctionalInterface)
//	default native sorting order			customided sorting order
//	present in java.lang 					present in java.util
//	compareTo()								Compare(), equals()

	@Override
	public int compare(Movie m1,Movie m2) {
		if(m1.getRating()<m2.getRating()) {
			return -1;
		}
		if(m1.getRating()>m2.getRating()) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	
	
//	@Override
//	public int compare(Movie m1, Movie m2)
//    {
//        return m1.getName().compareTo(m2.getName());
//    }
	
	public static void main(String args[]) {
		
		String s = "123";
		String s1 = new String("123");
		
		ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        Movie m1 = new Movie("Return of the Jedi", 8.4, 1983);
        Movie m2 = new Movie("Return of the Jedi", 8.4, 1983);
        ComparableVSComparator cc = new ComparableVSComparator();
        ComparableVSComparator cc1 = new ComparableVSComparator();
        System.out.println(cc.equals(cc1));
        Collections.sort(list, cc);
        Collections.reverse(list);
        for (Movie movie: list)
            System.out.println(movie.getRating() + " " +
                               movie.getName() + " " +
                               movie.getYear());
        
        cc.equals(cc1);
        m1.equals(m2);
        
		//all wrapper classes(all class implements comparable interface) && string class
		s.compareTo(s1);

		
	}
	
}
