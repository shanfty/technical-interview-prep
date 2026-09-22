package interview.prep.algorithms.meetingroomsii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countsConcurrentMeetings() {
        assertEquals(2, Solution.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}}));
    }

    @Test
    void reusesRoomForDisjointMeetings() {
        assertEquals(1, Solution.minMeetingRooms(new int[][]{{7, 10}, {2, 4}}));
    }

    @Test
    void handlesSingleMeeting() {
        assertEquals(1, Solution.minMeetingRooms(new int[][]{{1, 2}}));
    }
}
