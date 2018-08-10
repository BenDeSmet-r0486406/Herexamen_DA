package DeSmetBen.Movie_Omdb;

import java.util.HashMap;
import java.util.Map;

public class MovieDbService {
	private Map<String, Movie> movies;
	private MovieRequestService movieReq;
	
	public MovieDbService() {
		movieReq = new MovieRequestService();
		movies = new HashMap<>();
		
		//voorbeelden toevoegen
		this.addMovie("infinity war");
		this.addMovie("inception");
		this.addMovie("deadpool");
		this.addMovie("step up");
		this.addMovie("forrest gump");
	}
	
	public Movie getMovie(String title) {
		if(movies.get(title)== null) {
			this.addMovie(title);
			return movies.get(title);
		}else {
			return movies.get(title);
		}
	}
	
	public Movie findMovie(String title){
		return movieReq.movieRequest(title);
	}
	
	public void addMovie(String title){
		Movie movie = this.findMovie(title);
		movies.put(movie.getTitle(), movie);
	}
}