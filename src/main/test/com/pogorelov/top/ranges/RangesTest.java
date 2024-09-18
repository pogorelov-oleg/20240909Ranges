package com.pogorelov.top.ranges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RangesTest {
    @Test
    void getRangeLengthValid() {
        Assertions.assertEquals(-1, Ranges.getRangeLength(3, 1));
        Assertions.assertEquals(3, Ranges.getRangeLength(2, 4));

    }

    @Test
    void getRangeLengthInvalid() {
        Assertions.assertNotEquals(3, Ranges.getRangeLength(3, 1));
        Assertions.assertNotEquals(-1, Ranges.getRangeLength(2, 4));

    }

    @Test
    void checkIfValuesIntersectValid() {
        int[] rangeA = {1, 3};
        int[] rangeB = {2, 5};
        int[] rangeC = {5, 7};

        Assertions.assertEquals("Значения не пересекаются", Ranges.checkIfValuesIntersect(rangeA, rangeC));
        Assertions.assertEquals("Значения пересекаются: 2 3 ", Ranges.checkIfValuesIntersect(rangeA, rangeB));
    }

    @Test
    void checkIfValuesIntersectInvalid() {
        int[] rangeA = {1, 3};
        int[] rangeB = {2, 5};
        int[] rangeC = {5, 7};

        Assertions.assertNotEquals("Значения пересекаются: 2 3  ", Ranges.checkIfValuesIntersect(rangeA, rangeC));
        Assertions.assertNotEquals("Значения не пересекаются", Ranges.checkIfValuesIntersect(rangeA, rangeB));
    }
}
