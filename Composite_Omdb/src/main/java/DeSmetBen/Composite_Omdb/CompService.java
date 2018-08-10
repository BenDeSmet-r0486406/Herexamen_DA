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
		
		String movie = this.restTemplate.getForObject("http://movies/movie/getMovie/" + title, String.class);
		composite.setMovie(movie);
		
		String rec = this.restTemplate.getForObject("http://recs/recommendation/getRec/" + title, String.class);
		composite.setRecommendation(rec);
		
		String review = this.restTemplate.getForObject("http://reviews/review/getRev/" + title, String.class);
		composite.setReview(review);
		
		return composite;
	}
	
	public String getRecs() {
		String json = this.restTemplate.getForObject("http://recs/recommendation/allRecs", String.class);
		return json;
	}
}
