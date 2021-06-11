package microservices.book.gamification.game.badgeprocessors;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Collections;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import microservices.book.gamification.game.domain.BadgeType;

class GoldBadgeProcessorTest {

	private GoldBadgeProcessor badgeProcessor;

	@BeforeEach
	public void setUp() {
		badgeProcessor = new GoldBadgeProcessor();
	}

	@Test
	void shouldGiveBadgeIfScoreOverThreshold() {
		Optional<BadgeType> badgeType =
				badgeProcessor.processForOptionalBadge(450, Collections.emptyList(), null);
		assertThat(badgeType).contains(BadgeType.GOLD);
	}

	@Test
	void shouldNotGiveBadgeIfScoreUnderThreshold() {
		Optional<BadgeType> badgeType =
				badgeProcessor.processForOptionalBadge(350, Collections.emptyList(), null);
		assertThat(badgeType).isEmpty();
	}
}
