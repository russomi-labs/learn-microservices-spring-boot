package microservices.book.multiplication.challenge;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * This class represents a Challenge to solve a Multiplication problem
 */
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Challenge {
	private int factorA;
	private int factorB;
}
