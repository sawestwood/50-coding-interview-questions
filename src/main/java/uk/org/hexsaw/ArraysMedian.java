package uk.org.hexsaw;

public class ArraysMedian {

	public static int median(int[] intArray) {
        if (intArray.length %2 == 0) {
            // Get the median between two middle elements
            int lhsInt = intArray[(intArray.length/2) - 1];
            int rhsInt = intArray[intArray.length/2];
            return (lhsInt + rhsInt) / 2;
        } else {
            // odd-length array (only one middle element)
            return intArray[intArray.length/2];
        }
	}

}
