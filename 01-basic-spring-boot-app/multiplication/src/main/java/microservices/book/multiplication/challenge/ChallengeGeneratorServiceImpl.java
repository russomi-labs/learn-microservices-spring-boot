package microservices.book.multiplication.challenge;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class ChallengeGeneratorServiceImpl implements ChallengeGeneratorService {

    private static final int MINIMUM_FACTOR = 11;
    private static final int MAXIMUM_FACTOR = 100;

	private final Random random;

	public ChallengeGeneratorServiceImpl() {
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
