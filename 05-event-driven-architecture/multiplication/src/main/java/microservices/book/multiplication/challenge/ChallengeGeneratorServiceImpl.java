package microservices.book.multiplication.challenge;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ChallengeGeneratorServiceImpl implements ChallengeGeneratorService {

	private static final int MINIMUM_FACTOR = 11;
	private static final int MAXIMUM_FACTOR = 100;

	private final Random random;

	ChallengeGeneratorServiceImpl() {
		this.random = new Random();
	}

	protected ChallengeGeneratorServiceImpl(final Random random) {
		this.random = random;
	}

	private int next() {
		return random.nextInt(MAXIMUM_FACTOR - MINIMUM_FACTOR) + MINIMUM_FACTOR;
	}

	@Override
    public Challenge randomChallenge() {
        return new Challenge(next(), next());
    }
}
