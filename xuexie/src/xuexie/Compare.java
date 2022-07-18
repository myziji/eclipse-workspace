package xuexie;

import java.util.Comparator;

public class Compare implements Comparator<Movie>{

	@Override
	public int compare(Movie m1,Movie m2) {
		
		if(m1.getRating()>m2.getRating()) {
			return 1;
		}
		
		return 0;
	}
}
