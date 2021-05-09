package microservices.book.multiplication.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class ChallengeServiceTest {

	private ChallengeService challengeService;

	@BeforeEach
	void SetUp() {
		challengeService = new ChallengeServiceImpl();
	}

	@Test
	void checkCorrectAttemptTest() {
		//given
		ChallengeAttemptDTO challengeAttemptDTO = new ChallengeAttemptDTO(50, 60, "john_doe", 3000);

		//when
		ChallengeAttempt resultAttempt = challengeService.verifyAttempt(challengeAttemptDTO);

		//then
		then(resultAttempt.isCorrect()).isTrue();
	}

	@Test
	void checkIncorrectAttemptTest() {
		//given
		ChallengeAttemptDTO challengeAttemptDTO = new ChallengeAttemptDTO(50, 60, "john_doe", 5000);

		//when
		ChallengeAttempt resultAttempt = challengeService.verifyAttempt(challengeAttemptDTO);

		//then
		then(resultAttempt.isCorrect()).isFalse();
	}
}
