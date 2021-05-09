package microservices.book.multiplication.challenge;

import org.springframework.stereotype.Service;

import microservices.book.multiplication.user.User;

@Service
public class ChallengeServiceImpl implements ChallengeService {

	@Override
	public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO challengeAttemptDTO) {
		boolean isCorrect = challengeAttemptDTO.getGuess() == challengeAttemptDTO.getFactorA()
				* challengeAttemptDTO.getFactorB();
		User user = new User(null, challengeAttemptDTO.getUserAlias());
		return new ChallengeAttempt(null, user.getAlias(), challengeAttemptDTO.getFactorA(),
				challengeAttemptDTO.getFactorB(), challengeAttemptDTO.getGuess(), isCorrect);
	}
}
