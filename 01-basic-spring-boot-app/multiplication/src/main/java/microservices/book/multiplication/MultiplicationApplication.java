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
	// 	ObjectMapper om = new ObjectMapper();
	// 	om.setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CAMEL_CASE);
	// 	return om;
	// }
}
