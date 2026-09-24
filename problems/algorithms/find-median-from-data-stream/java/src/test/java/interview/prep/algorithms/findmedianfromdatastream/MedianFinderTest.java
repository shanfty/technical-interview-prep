package interview.prep.algorithms.findmedianfromdatastream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MedianFinderTest {
    @Test
    void updatesOddAndEvenMedians() {
        MedianFinder finder = new MedianFinder();
        finder.addNum(1);
        finder.addNum(2);
        assertEquals(1.5, finder.findMedian());
        finder.addNum(3);
        assertEquals(2.0, finder.findMedian());
    }

    @Test
    void handlesNegativeValues() {
        MedianFinder finder = new MedianFinder();
        finder.addNum(-1);
        finder.addNum(-2);
        finder.addNum(-3);
        assertEquals(-2.0, finder.findMedian());
    }

    @Test
    void handlesUnsortedInsertionOrder() {
        MedianFinder finder = new MedianFinder();
        finder.addNum(5);
        finder.addNum(1);
        finder.addNum(9);
        finder.addNum(3);
        assertEquals(4.0, finder.findMedian());
    }
}
