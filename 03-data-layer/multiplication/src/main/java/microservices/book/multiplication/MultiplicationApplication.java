package microservices.book.multiplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplicationApplication.class, args);
	}

	// @Bean
	// public ObjectMapper objectMapper() {
	// 	var om = new ObjectMapper();
	// 	om.setPropertyNamingStrategy(PropertyNamingStrategies.UPPER_CAMEL_CASE);
	// 	return om;
	// }

}
