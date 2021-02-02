package uk.org.hexsaw;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class ArraysMedianTest {

    @Test
    void validateMedianWhenArrayHasAnOddNumberOfElements() {
        int[] sampleIntArray = {1,3,5};
        assertEquals(3, ArraysMedian.median(sampleIntArray));
    }

    @Test
    void validateMedianWhenArrayHasAnEvenNumberOfElements() {
        int[] sampleIntArray = {1,3,5,7};
        assertEquals(4, ArraysMedian.median(sampleIntArray));
    }

    @Test
    void canHandleEmptyArrayWhenDeterminingMedianInOneArray() {
        int[] emptyArray = {};
        assertNull(ArraysMedian.median(emptyArray));
    }

    @Test
    void validateMedianOfTwoArrays() {
        int[] firstIntArray = {1,3,5};
        int[] secondIntArray = {2,4,6};
        assertEquals(3.5, ArraysMedian.medianOfTwoArrays(firstIntArray, secondIntArray));
    }

    @Test
    void validateMedianOfTwoArraysWhenFirstOneEmpty() {
        int[] firstIntArray = {};
        int[] secondIntArray = {2,4,6};
        assertEquals(4, ArraysMedian.medianOfTwoArrays(firstIntArray, secondIntArray));
    }

    @Test
    void validateMedianOfTwoArraysWhenSecondOneEmpty() {
        int[] firstIntArray = {1,3,5};
        int[] secondIntArray = {};
        assertEquals(3, ArraysMedian.medianOfTwoArrays(firstIntArray, secondIntArray));
    }

    @Test
    void canHandleMedianForTwoEmptyArrays() {
        int[] firstIntArray = {};
        int[] secondIntArray = {};
        assertNull(ArraysMedian.medianOfTwoArrays(firstIntArray, secondIntArray));
    }



}
