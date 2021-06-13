package microservices.book.gamification.game.domain;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.With;

/**
 * Represents a line in our Leaderboard.
 */
@Value
@AllArgsConstructor
public class LeaderBoardRow {

	Long userId;
	Long totalScore;
	@With
	List<String> badges;

	public LeaderBoardRow(final Long userId, final Long totalScore) {
		this.userId = userId;
		this.totalScore = totalScore;
		this.badges = new ArrayList<>(); // Java 9 can use List.of()
	}

}
