package DeSmetBen.Review_Omdb;

public class Review {
	private String movie;
	private String review;
	
	
	public Review(String movie, String review) {
		this.movie = movie;
		this.review = review;
	}
	
	public String getMovie() {
		return movie;
	}
	
	public String getReview() {
		return review;
	}
}