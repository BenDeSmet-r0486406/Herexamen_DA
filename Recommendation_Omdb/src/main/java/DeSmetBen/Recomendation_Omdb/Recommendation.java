package DeSmetBen.Recomendation_Omdb;

public class Recommendation {
	private String movie;
	private String recommendation;
	
	
	public Recommendation(String movie, String recommendation) {
		this.movie = movie;
		this.recommendation = recommendation;
	}
	
	public String getMovie() {
		return movie;
	}
	
	public String getRecommendation() {
		return recommendation;
	}
}
