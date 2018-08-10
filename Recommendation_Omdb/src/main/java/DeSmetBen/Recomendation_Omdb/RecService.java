package DeSmetBen.Recomendation_Omdb;


import java.util.ArrayList;
import java.util.List;

public class RecService {
	private List<Recommendation> recommendations;
	
	public RecService() {
		recommendations = new ArrayList<Recommendation>();
		
		Recommendation rec = new Recommendation("Deadpool", "deadpool 2");
		recommendations.add(rec);
		rec = new Recommendation("Forrest Gump", "Cast away");
		recommendations.add(rec);
		rec = new Recommendation("Step Up", "step up 2");
		recommendations.add(rec);
		rec = new Recommendation("Infinity War", "avengers");
		recommendations.add(rec);
		rec = new Recommendation("Inception", "shutter island");
		recommendations.add(rec);
	}
	
	public Recommendation getRec(String title){
		for (Recommendation recommendation : recommendations) {
			if (recommendation.getMovie().equals(title)) {
				return recommendation;
			}
		}
		
		throw new IllegalArgumentException("No recommendation for this movie");
	}
	
	public List<Recommendation> getAllRecs() {
		return this.recommendations;
	}

}

