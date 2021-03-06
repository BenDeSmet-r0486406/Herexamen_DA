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
		Recommendation result = new Recommendation(title, "this movie has no recommendation");
		for (Recommendation rec : recommendations) {
			if (rec.getTitle().equals(title)) {
				result = rec;
			}
		}
		
		return result;
	}
	
	public List<Recommendation> getAllRecs() {
		return this.recommendations;
	}

}

