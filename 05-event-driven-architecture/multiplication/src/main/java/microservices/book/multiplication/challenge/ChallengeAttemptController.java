package microservices.book.multiplication.challenge;

import java.util.List;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * This class provides a REST API to POST the attempts from users.
 */
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/attempts")
class ChallengeAttemptController {

  private final ChallengeService challengeService;

  @PostMapping
  public ResponseEntity<ChallengeAttempt> postResult(
      @RequestBody @Valid ChallengeAttemptDTO challengeAttemptDTO) {

    log.debug("getStatistics for {}", challengeAttemptDTO.toString());
    return ResponseEntity.ok(challengeService.verifyAttempt(challengeAttemptDTO));
  }

  @GetMapping
  public ResponseEntity<List<ChallengeAttempt>> getStatistics(
      @RequestParam("alias") String alias) {

    log.debug("getStatistics for {}", alias);
    return ResponseEntity.ok(challengeService.getStatsForUser(alias));
  }
}
