package AverageOfSubarrayOfSizeK;

public class AverageOfSubarrayOfSizeK {
	
	//Brute Force Algorithm
	public static double[] findAverages(int k, int[] arr) {
		double result[] = new double[arr.length - k+1];
		
		for(int i=0; i<=arr.length-k; i++) {
			double sum = 0;
			for(int j=i; j<k+i; j++) {
				sum = sum + arr[j];
			}
			result[i] = sum/k;
		}
		return result;
	}
	
	public static double[] findAverages_windowPattern(int k, int[] arr) {
		return new double[] {1,2,4};
	}
}
