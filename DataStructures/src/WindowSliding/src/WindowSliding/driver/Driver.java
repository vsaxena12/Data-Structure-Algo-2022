package WindowSliding.driver;
import WindowSliding.ProblemStatements.AverageOfSubarrayOfSize;


public class Driver
{
	public static void maxSumSubArrayOfSizeK() 
	{
    	MaxSumSubArrayOfSizeK resultSumArrayOfSizeK = new MaxSumSubArrayOfSizeK();
    	System.out.println("Maximum sum of a subarray of size K: "
    		+resultSumArrayOfSizeK.findMaxSumSubArray(2, new int[] {2,1,5,1,3,2}));
  	}

  	
	public static void main(String args[])
	{
		System.out.println("Test");
		maxSumSubArrayOfSizeK();
		
	}
}