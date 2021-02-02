package uk.org.hexsaw;

public class ArraysMedian {

	public static Double median(int[] intArray) {
        if (intArray.length == 0) {
            return null;
        }
        if (intArray.length %2 == 0) {
            // Get the median between two middle elements
            int lhsInt = intArray[(intArray.length/2) - 1];
            int rhsInt = intArray[intArray.length/2];
            return Double.valueOf((lhsInt + rhsInt)/2.0);
        } else {
            // odd-length array (only one middle element)
            return Double.valueOf(intArray[intArray.length/2]);
        }
	}

	public static Double medianOfTwoArrays(int[] firstIntArray, int[] secondIntArray) {
        Double firstMedian = median(firstIntArray);
        Double secondMedian = median(secondIntArray);
        if (firstMedian == null && secondMedian == null) {
            return null;
        } else {
            if (firstMedian == null)  {
                return secondMedian;
            } else if (secondMedian == null) {
                return firstMedian;
            } else {
                return (firstMedian + secondMedian)/2;
            }
        }
	}

}
