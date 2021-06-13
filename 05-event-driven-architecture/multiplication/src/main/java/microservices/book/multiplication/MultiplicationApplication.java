package microservices.book.multiplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class MultiplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplicationApplication.class, args);
	}

	// @Bean
	// public ObjectMapper objectMapper() {
	// var om = new ObjectMapper();
	// om.setPropertyNamingStrategy(PropertyNamingStrategies.UPPER_CAMEL_CASE);
	// return om;
	// }

	@Configuration
	public class SpringFoxConfig {
		@Bean
		public Docket api() {
			return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
					.paths(PathSelectors.any()).build();
		}
	}
}
