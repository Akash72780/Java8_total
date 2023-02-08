package orm;

public class Movie {
	
	public String name;
	public String releaseMonth;
	public int boxOfcCollection;
	public Movie(String name, String releaseMonth, int boxOfcCollection) {
		super();
		this.name = name;
		this.releaseMonth = releaseMonth;
		this.boxOfcCollection = boxOfcCollection;
	}
}
