package AverageOfSubarrayOfSizeK;

import java.util.Arrays;

public class Driver {
	public static void main(String args[]) {
		int array[] = {1, 3, 2, 6, -1, 4, 1, 8, 2};
		int k = 5;
		AverageOfSubarrayOfSizeK subArray = new AverageOfSubarrayOfSizeK();
		double result[] = subArray.findAverages(k, array);
		System.out.println("Avg subarray"+ Arrays.toString(result));
		
	}
}
