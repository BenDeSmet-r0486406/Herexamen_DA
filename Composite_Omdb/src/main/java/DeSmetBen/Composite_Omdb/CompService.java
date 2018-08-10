package DeSmetBen.Composite_Omdb;

import org.springframework.web.client.RestTemplate;

import org.springframework.beans.factory.annotation.Autowired;

public class CompService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public CompService() {
	}
	
	public CompositeMovie getAll(String title) {
		CompositeMovie composite = new CompositeMovie();
		
		/*Movie movie = this.restTemplate.getForObject("http://movies/movie/getMovie/" + title, Movie.class);
		composite.setMovie(movie.getTitle());
		
		Recommendation rec = this.restTemplate.getForObject("http://recs/recommendation/getRec/" + title, Recommendation.class);
		composite.setRecommendation(rec.getRecommendation());
		
		Review review = this.restTemplate.getForObject("http://reviews/review/getRev/" + title, Review.class);
		composite.setReview(review.getReview());*/
		
		String movieTitle = this.restTemplate.getForObject("http://movies/movie/getTitle/" + title, String.class);
		composite.setTitle(movieTitle);
		
		String movieRating = this.restTemplate.getForObject("http://movies/movie/getRating/" + title, String.class);
		composite.setRating(movieRating);
		
		String movieGenre = this.restTemplate.getForObject("http://movies/movie/getGenre/" + title, String.class);
		composite.setGenre(movieGenre);
		
		String rec = this.restTemplate.getForObject("http://recs/recommendation/getRec/" + title, String.class);
		composite.setRecommendation(rec);
		
		String review = this.restTemplate.getForObject("http://reviews/review/getRev/" + title, String.class);
		composite.setReview(review);
		
		return composite;
	}
	
	public String getMovie(String title) {
		String json = this.restTemplate.getForObject("http://movies/movie/getMovie/" + title, String.class);
		return json;
	}
	
	public String getRec(String title) {
		String json = this.restTemplate.getForObject("http://recs/recommendation/" + title, String.class);
		return json;
	}
	
	public String getRev(String title) {
		String json = this.restTemplate.getForObject("http://reviews/review/" + title, String.class);
		return json;
	}
	
	public String getRecs() {
		String json = this.restTemplate.getForObject("http://recs/recommendation/allRecs", String.class);
		return json;
	}
	
	public String getRevs() {
		String json = this.restTemplate.getForObject("http://reviews/review/all", String.class);
		return json;
	}
}
