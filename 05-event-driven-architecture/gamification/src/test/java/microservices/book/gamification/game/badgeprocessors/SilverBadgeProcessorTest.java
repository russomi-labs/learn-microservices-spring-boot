package microservices.book.gamification.game.badgeprocessors;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Collections;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import microservices.book.gamification.game.domain.BadgeType;

class SilverBadgeProcessorTest {

	private SilverBadgeProcessor badgeProcessor;

	@BeforeEach
	public void setUp() {
		badgeProcessor = new SilverBadgeProcessor();
	}

	@Test
	void shouldGiveBadgeIfScoreOverThreshold() {
		Optional<BadgeType> badgeType =
				badgeProcessor.processForOptionalBadge(160, Collections.emptyList(), null);
		assertThat(badgeType).contains(BadgeType.SILVER);
	}

	@Test
	void shouldNotGiveBadgeIfScoreUnderThreshold() {
		Optional<BadgeType> badgeType =
				badgeProcessor.processForOptionalBadge(140, Collections.emptyList(), null);
		assertThat(badgeType).isEmpty();
	}
}
