package microservices.book.multiplication.challenge;

import lombok.Value;

/**
 * Attempt coming from a User
 */
@Value
public class ChallengeAttemptDTO {
	int factorA;
	int factorB;
	String userAlias;
	int guess;
}
