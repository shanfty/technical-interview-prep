package interview.prep.algorithms.blackjackhand;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest(name = "{0}")
    @MethodSource("cases")
    void classifiesHandAndReturnsHighestCard(String name, String[] cards, String expected) {
        assertEquals(expected, Solution.blackjackHand(cards));
    }

    static Stream<Arguments> cases() {
        return Stream.of(
            Arguments.of("supplied example", new String[]{"ten", "two", "ace"}, "below ten"),
            Arguments.of("ace with king", new String[]{"ace", "king"}, "blackjack ace"),
            Arguments.of("queen outranks jack", new String[]{"jack", "queen"}, "below queen"),
            Arguments.of("above with king", new String[]{"king", "queen", "two"}, "above king"),
            Arguments.of("one high ace remains", new String[]{"ace", "ace", "nine"}, "blackjack ace"),
            Arguments.of("single two", new String[]{"two"}, "below two"),
            Arguments.of("single ace", new String[]{"ace"}, "below ace"),
            Arguments.of("total twenty", new String[]{"ten", "ten"}, "below ten"),
            Arguments.of("total twenty-one without aces", new String[]{"ten", "nine", "two"}, "blackjack ten"),
            Arguments.of("total twenty-two", new String[]{"ten", "ten", "two"}, "above ten"),
            Arguments.of("jack outranks ten", new String[]{"jack", "ten"}, "below jack"),
            Arguments.of("king outranks queen", new String[]{"queen", "king"}, "below king"),
            Arguments.of("all face ranks", new String[]{"queen", "king", "jack"}, "above king"),
            Arguments.of("high ace below twenty-one", new String[]{"nine", "ace"}, "below ace"),
            Arguments.of("low ace at twenty-one", new String[]{"ace", "queen", "king"}, "blackjack king"),
            Arguments.of("low ace above twenty-one", new String[]{"ace", "king", "queen", "two"}, "above king"),
            Arguments.of("two aces alone", new String[]{"ace", "ace"}, "below ace"),
            Arguments.of("both aces low", new String[]{"ace", "ten", "ace"}, "below ten"),
            Arguments.of("three aces with one high", new String[]{"ace", "eight", "ace", "ace"}, "blackjack ace"),
            Arguments.of("multiple low aces still above", new String[]{"ace", "ten", "ace", "king"}, "above king"),
            Arguments.of("numeric ranks three through six", new String[]{"three", "six", "four", "five"}, "below six"),
            Arguments.of("numeric ranks seven through nine", new String[]{"eight", "seven", "nine"}, "above nine"),
            Arguments.of("numeric rank ten above nine", new String[]{"nine", "ten"}, "below ten"),
            Arguments.of("reordered supplied example", new String[]{"ace", "two", "ten"}, "below ten")
        );
    }
}
