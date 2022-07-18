package xuexie;

public class Movie{
	
	private double rating;
	private String name;
	private int year;
	public Movie() {
	
	}
	public Movie(String name, Double rating, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", name=" + name + ", year=" + year + "]";
	}
	
	

}
