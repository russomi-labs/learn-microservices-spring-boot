package microservices.book.gamification.game.badgeprocessors;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import microservices.book.gamification.game.domain.BadgeType;

class BronzeBadgeProcessorTest {

	private BronzeBadgeProcessor badgeProcessor;

	@BeforeEach
	public void setUp() {
		badgeProcessor = new BronzeBadgeProcessor();
	}

	@Test
	void shouldGiveBadgeIfScoreOverThreshold() {
		Optional<BadgeType> badgeType = badgeProcessor.processForOptionalBadge(60, Collections.emptyList(), null);
		assertThat(badgeType).contains(BadgeType.BRONZE);
	}

	@Test
	void shouldNotGiveBadgeIfScoreUnderThreshold() {
		Optional<BadgeType> badgeType =
				badgeProcessor.processForOptionalBadge(40, new ArrayList<>(), null);
		assertThat(badgeType).isEmpty();
	}
}
