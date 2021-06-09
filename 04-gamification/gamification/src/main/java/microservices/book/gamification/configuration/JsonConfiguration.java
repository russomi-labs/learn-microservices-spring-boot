package microservices.book.gamification.configuration;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration to handle lazy fetching with JSON serialization.
 */
@Configuration
public class JsonConfiguration {

	@Bean
	public Module hibernateModule() {
		return new Hibernate5Module();
	}

}
