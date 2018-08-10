package DeSmetBen.Review_Omdb;


import java.util.ArrayList;
import java.util.List;

public class RevService {
	private List<Review> reviews;
	
	public RevService() {
		reviews = new ArrayList<Review>();
		
		Review rev = new Review("Deadpool", "most awesome movie ever");
		reviews.add(rev);
		rev = new Review("Forrest Gump", "really long, but every second is interessting");
		reviews.add(rev);
		rev = new Review("Step Up", "nice");
		reviews.add(rev);
		rev = new Review("Infinity War", "why did they all die!!! :o");
		reviews.add(rev);
		rev = new Review("Inception", "mind f**k");
		reviews.add(rev);
	}
	
	public Review getRev(String title){
		for (Review rev : reviews) {
			if (rev.getMovie().equals(title)) {
				return rev;
			}
		}
		
		throw new IllegalArgumentException("No review for this movie");
	}
	
	public List<Review> getAllRevs() {
		return this.reviews;
	}

}

