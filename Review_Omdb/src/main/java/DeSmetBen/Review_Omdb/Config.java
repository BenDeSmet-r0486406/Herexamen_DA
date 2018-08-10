package DeSmetBen.Review_Omdb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config{
	
	
	@Bean
	public RevService revService() {
		return new RevService();	
	}
}