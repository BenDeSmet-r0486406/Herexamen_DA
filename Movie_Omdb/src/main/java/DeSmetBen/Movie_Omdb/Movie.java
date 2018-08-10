package DeSmetBen.Movie_Omdb;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {
	@JsonProperty("Title")
	private String title;
	@JsonProperty("imdbRating")
	private String rating;
	@JsonProperty("Genre")
	private String genre;
	
	
	public Movie(String title, String rated, String genre){
		setTitle(title);
		setRating(rated);
		setGenre(genre);
	}
	
	public Movie() {
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	 public String toString() {
		 return "Movie{" + 
				 "title='"+ this.title +'\'' +
				 ", imdbRating='" + this.rating +'\'' +
				 ", genre='" + this.genre +'\'' +
				 '}';
	 }

}
