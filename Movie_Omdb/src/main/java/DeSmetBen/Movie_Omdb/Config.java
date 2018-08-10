package DeSmetBen.Movie_Omdb;
//controller config
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	
	@Bean
	public MovieDbService service() {
		return new MovieDbService();
	}
	
	
}

