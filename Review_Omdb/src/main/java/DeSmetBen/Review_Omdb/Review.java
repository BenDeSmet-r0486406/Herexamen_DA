package DeSmetBen.Review_Omdb;

public class Review {
	private String title;
	private String review;
	
	
	public Review(String title, String review) {
		this.title = title;
		this.review = review;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getReview() {
		return review;
	}
}
