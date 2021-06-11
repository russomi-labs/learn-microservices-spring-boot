package microservices.book.gamification.game;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import microservices.book.gamification.game.domain.BadgeCard;

/**
 * Handles data operations with BadgeCards
 */
public interface BadgeRepository extends CrudRepository<BadgeCard, Long> {

    /**
     * Retrieves all BadgeCards for a given user.
     *
     * @param userId the id of the user to look for BadgeCards
     * @return the list of BadgeCards, sorted by most recent.
     */
    List<BadgeCard> findByUserIdOrderByBadgeTimestampDesc(final Long userId);

}
