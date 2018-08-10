package DeSmetBen.Composite_Omdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;



@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "Composite_Omdb")
public class CompositeOmdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompositeOmdbApplication.class, args);
	}
}
