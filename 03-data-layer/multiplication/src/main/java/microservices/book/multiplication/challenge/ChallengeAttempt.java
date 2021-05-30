package microservices.book.multiplication.challenge;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import microservices.book.multiplication.user.User;

/**
 * Identifies the attempt from a {@link User} to solve a challenge.
 */
@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class ChallengeAttempt {
	private Long id;
	private User user;
	private int factorA;
	private int factorB;
	private int resultAttempt;
	private boolean correct;
}
