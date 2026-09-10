package interview.prep.algorithms.closestcarrot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest(name = "{0}")
    @MethodSource("cases")
    void returnsDistance(String name, List<List<String>> grid, int row, int col, int expected) {
        assertEquals(expected, Solution.closestCarrot(grid, row, col));
    }

    static Stream<Arguments> cases() {
        return Stream.of(
            Arguments.of("statement: reachable", grid("OOC", "OXO", "OOO"), 2, 0, 4),
            Arguments.of("statement: unreachable", grid("OXC", "OXO"), 0, 0, -1),
            Arguments.of("statement: starting on carrot", grid("CO"), 0, 0, 0),
            Arguments.of("single carrot cell", grid("C"), 0, 0, 0),
            Arguments.of("single open cell", grid("O"), 0, 0, -1),
            Arguments.of("no carrots in open area", grid("OOO", "OOO"), 0, 1, -1),
            Arguments.of("adjacent above", grid("OCO", "OOO", "OOO"), 1, 1, 1),
            Arguments.of("adjacent below", grid("OOO", "OOO", "OCO"), 1, 1, 1),
            Arguments.of("adjacent left", grid("OOO", "COO", "OOO"), 1, 1, 1),
            Arguments.of("adjacent right", grid("OOO", "OOC", "OOO"), 1, 1, 1),
            Arguments.of("single row", grid("COOOO"), 0, 4, 4),
            Arguments.of("single column", grid("O", "O", "O", "C"), 0, 0, 3),
            Arguments.of("wall blocks single row", grid("OXOC"), 0, 0, -1),
            Arguments.of("diagonal is not a move", grid("OX", "XC"), 0, 0, -1),
            Arguments.of("diagonal requires two moves", grid("OO", "OC"), 0, 0, 2),
            Arguments.of("nearest of several carrots", grid("COOOOC"), 0, 4, 1),
            Arguments.of("equally near carrots", grid("COOOC"), 0, 2, 2),
            Arguments.of("ignore unreachable nearby carrot", grid("OXCX", "OXXX", "OOOC"), 0, 0, 5),
            Arguments.of("detour around wall", grid("OXCO", "OXOO", "OOOO"), 0, 0, 6),
            Arguments.of("enclosed start", grid("XXXC", "XXOX", "XXXX"), 1, 2, -1),
            Arguments.of("wide rectangular grid", grid("OOOOOC", "OOOOOO"), 1, 0, 6),
            Arguments.of("open area with several routes", grid("OOOO", "OOOO", "OOOC"), 0, 0, 5)
        );
    }

    @Test
    void preservesMutableInput() {
        List<List<String>> original = grid("OOC", "OXO", "OOO");
        List<List<String>> mutable = new ArrayList<>();
        for (List<String> row : original) {
            mutable.add(new ArrayList<>(row));
        }
        Solution.closestCarrot(mutable, 2, 0);
        assertEquals(original, mutable);
    }

    @Test
    void handlesLongCorridor() {
        List<String> row = new ArrayList<>();
        for (int i = 0; i < 999; i++) {
            row.add("O");
        }
        row.add("C");
        assertEquals(999, Solution.closestCarrot(List.of(List.copyOf(row)), 0, 0));
    }

    private static List<List<String>> grid(String... rows) {
        return Stream.of(rows)
            .map(row -> row.chars().mapToObj(cell -> String.valueOf((char) cell)).toList())
            .toList();
    }
}
