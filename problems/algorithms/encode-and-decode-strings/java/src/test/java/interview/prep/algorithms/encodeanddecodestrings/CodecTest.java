package interview.prep.algorithms.encodeanddecodestrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class CodecTest {
    @Test
    void roundTripsNormalStrings() {
        Codec codec = new Codec();
        List<String> input = List.of("neet", "code", "practice");
        assertEquals(input, codec.decode(codec.encode(input)));
    }

    @Test
    void preservesEmptyAndDelimiterContainingStrings() {
        Codec codec = new Codec();
        List<String> input = List.of("", "a#b", "##");
        assertEquals(input, codec.decode(codec.encode(input)));
    }

    @Test
    void roundTripsEmptyList() {
        Codec codec = new Codec();
        assertEquals(List.of(), codec.decode(codec.encode(List.of())));
    }
}
