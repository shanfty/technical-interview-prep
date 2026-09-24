package interview.prep.algorithms.reconstructitinerary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void usesEveryTicketInOrder() {
        assertEquals(List.of("JFK", "MUC", "LHR", "SFO", "SJC"), Solution.findItinerary(List.of(List.of("MUC", "LHR"), List.of("JFK", "MUC"), List.of("SFO", "SJC"), List.of("LHR", "SFO"))));
    }

    @Test
    void choosesLexicographicallySmallestValidRoute() {
        assertEquals(List.of("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"), Solution.findItinerary(List.of(List.of("JFK", "SFO"), List.of("JFK", "ATL"), List.of("SFO", "ATL"), List.of("ATL", "JFK"), List.of("ATL", "SFO"))));
    }
}
