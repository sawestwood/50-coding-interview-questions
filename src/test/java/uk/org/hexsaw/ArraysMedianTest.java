package uk.org.hexsaw;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

}
