package DeSmetBen.Movie_Omdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieController {
	@Autowired
	private DiscoveryClient discoveryClient;
	@Autowired
	private MovieDbService movies;
	
	@RequestMapping("/info")
	public String activated() {
		return " try /movie/getMovie/{title}";
	}
	
	@RequestMapping("/movie/getMovie/{title}")
	public Movie getMovie(@PathVariable String title) {
		if(this.movies.getMovie(title) == null) {
			return new Movie("dit is geen film", "de film is leeg", "Test");
		}else {
			return this.movies.getMovie(title);
		}
	}
}
