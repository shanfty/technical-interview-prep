package interview.prep.algorithms.meetingroomsproblem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void rejectsOverlappingMeetings() {
        assertFalse(Solution.canAttendMeetings(new int[][]{{0,30},{5,10},{15,20}}));
    }
    @Test void acceptsMeetingsThatTouchAtBoundary() {
        assertTrue(Solution.canAttendMeetings(new int[][]{{0,10},{10,20}}));
    }
}

