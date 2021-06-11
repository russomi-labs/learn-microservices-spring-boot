package microservices.book.gamification.game;

import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.BDDMockito.given;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import microservices.book.gamification.game.domain.BadgeCard;
import microservices.book.gamification.game.domain.BadgeType;
import microservices.book.gamification.game.domain.LeaderBoardRow;

@ExtendWith(MockitoExtension.class)
class LeaderBoardServiceImplTest {

	private LeaderBoardServiceImpl leaderBoardService;

	@Mock
	private ScoreRepository scoreRepository;
	@Mock
	private BadgeRepository badgeRepository;

	@BeforeEach
	public void setUp() {
		leaderBoardService = new LeaderBoardServiceImpl(scoreRepository, badgeRepository);
	}

	@Test
	void retrieveLeaderBoardTest() {
		// given
		LeaderBoardRow scoreRow = new LeaderBoardRow(1L, 300L, Collections.emptyList());
		given(scoreRepository.findFirst10()).willReturn(Arrays.asList(scoreRow));
		given(badgeRepository.findByUserIdOrderByBadgeTimestampDesc(1L))
				.willReturn(Arrays.asList(new BadgeCard(1L, BadgeType.LUCKY_NUMBER)));

		// when
		List<LeaderBoardRow> leaderBoard = leaderBoardService.getCurrentLeaderBoard();

		// then
		List<LeaderBoardRow> expectedLeaderBoard = Arrays.asList(new LeaderBoardRow(1L, 300L,
				Arrays.asList(BadgeType.LUCKY_NUMBER.getDescription())));
		then(leaderBoard).isEqualTo(expectedLeaderBoard);
	}
}
