package DeSmetBen.Movie_Omdb;

import org.springframework.web.client.RestTemplate;

public class MovieRequestService {
	
	public Movie movieRequest(String title) {
		RestTemplate restTemplate = new RestTemplate();
		Movie movie = restTemplate.getForObject("http://www.omdbapi.com/?apikey=fcf15e64&t=" + title, Movie.class);
		return movie;
	}

}
