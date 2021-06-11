package microservices.book.gamification.game.badgeprocessors;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import microservices.book.gamification.game.domain.BadgeType;
import microservices.book.gamification.game.domain.ScoreCard;

class FirstWonBadgeProcessorTest {

	private FirstWonBadgeProcessor badgeProcessor;

	@BeforeEach
	public void setUp() {
		badgeProcessor = new FirstWonBadgeProcessor();
	}

	@Test
	void shouldGiveBadgeIfFirstTime() {
		Optional<BadgeType> badgeType = badgeProcessor.processForOptionalBadge(10,
				Collections.singletonList(new ScoreCard(1L, 1L)), null);
		assertThat(badgeType).contains(BadgeType.FIRST_WON);
	}

	@Test
	void shouldNotGiveBadgeIfNotFirstTime() {
		Optional<BadgeType> badgeType = badgeProcessor.processForOptionalBadge(20,
				Arrays.asList(new ScoreCard(1L, 1L), new ScoreCard(1L, 2L)), null);
		assertThat(badgeType).isEmpty();
	}
}
