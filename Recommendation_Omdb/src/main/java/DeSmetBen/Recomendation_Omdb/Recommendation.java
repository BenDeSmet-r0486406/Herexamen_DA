package DeSmetBen.Recomendation_Omdb;

public class Recommendation {
	private String title;
	private String recommendation;
	
	
	public Recommendation(String title, String recommendation) {
		this.title = title;
		this.recommendation = recommendation;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getRecommendation() {
		return recommendation;
	}
}
