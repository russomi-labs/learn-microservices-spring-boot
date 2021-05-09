package microservices.book.multiplication.challenge;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class ChallengeGeneratorServiceTest {

	private ChallengeGeneratorService challengeGeneratorService;

	@Spy
	private Random random;

	@BeforeEach
	public void setUp(){
		challengeGeneratorService = new ChallengeGeneratorServiceImpl(random);
	}

	@Test
	void generateRandomFactorIsBetweenExpectedLimits() {
		// 89 is max - min value
		given(random.nextInt(89)).willReturn(20,30);

		// when we generate a challenge
		Challenge challenge = challengeGeneratorService.randomChallenge();

		// then challenge contains factors as expected
		then(challenge).isEqualTo(new Challenge(31,41));
	}
}
