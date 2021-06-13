package microservices.book.gamification.game.badgeprocessors;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import microservices.book.gamification.challenge.ChallengeSolvedEvent;
import microservices.book.gamification.game.domain.BadgeType;
import microservices.book.gamification.game.domain.ScoreCard;

class LuckyNumberBadgeProcessorTest {

	private LuckyNumberBadgeProcessor badgeProcessor;

	@BeforeEach
	public void setUp() {
		badgeProcessor = new LuckyNumberBadgeProcessor();
	}

	@Test
	void shouldGiveBadgeIfLuckyFactor() {
		Optional<BadgeType> badgeType =
				badgeProcessor.processForOptionalBadge(10, Arrays.asList(new ScoreCard(1L, 1L)),
						new ChallengeSolvedEvent(1L, true, 42, 10, 1L, "John"));
		assertThat(badgeType).contains(BadgeType.LUCKY_NUMBER);
	}

	@Test
	void shouldNotGiveBadgeIfNotLuckyFactor() {
		Optional<BadgeType> badgeType =
				badgeProcessor.processForOptionalBadge(10, Arrays.asList(new ScoreCard(1L, 1L)),
						new ChallengeSolvedEvent(1L, true, 43, 10, 1L, "John"));
		assertThat(badgeType).isEmpty();
	}
}
