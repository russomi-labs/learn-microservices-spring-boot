package microservices.book.multiplication.challenge;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Identifies the attempt from a {@link User} to solve a challenge.
 */
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class ChallengeAttempt {
	private Long id;
	private String userId;
	private int factorA;
	private int factorB;
	private int resultAttempt;
	private boolean correct;
}
