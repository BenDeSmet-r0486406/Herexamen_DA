package DeSmetBen.Recomendation_Omdb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config{
	
	
	@Bean
	public RecService recService() {
		return new RecService();	
	}
}