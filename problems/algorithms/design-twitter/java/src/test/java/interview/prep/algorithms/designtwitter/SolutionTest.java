package interview.prep.algorithms.designtwitter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void feedContainsOwnAndFollowedTweetsNewestFirst() {
        Solution.Twitter twitter = new Solution.Twitter();
        twitter.postTweet(1, 5);
        twitter.postTweet(2, 6);
        twitter.follow(1, 2);
        assertEquals(List.of(6, 5), twitter.getNewsFeed(1));
    }
    @Test void unfollowRemovesFolloweesTweets() {
        Solution.Twitter twitter = new Solution.Twitter();
        twitter.postTweet(2, 6);
        twitter.follow(1, 2);
        twitter.unfollow(1, 2);
        assertEquals(List.of(), twitter.getNewsFeed(1));
    }
}

