package come.example.WelcomeMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class WelcomeMicroserviceApplication {

		public static void main(String[] args) {
			SpringApplication.run(WelcomeMicroserviceApplication.class, args);
		}
	}
	 



