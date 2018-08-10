package DeSmetBen.Eureka_Omdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaOmdb {

	public static void main(String[] args) {
		SpringApplication.run(EurekaOmdb.class, args);
	}
}
