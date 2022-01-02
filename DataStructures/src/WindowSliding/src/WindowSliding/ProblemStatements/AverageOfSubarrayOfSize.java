package WindowSliding.ProblemStatements;
import java.util.Arrays;

public class AverageOfSubarrayOfSize
{
	//Brute Force 
	public static double[] findAverages(int k, int[] arr) 
	{
    	double[] result = new double[arr.length - k + 1];
    	for(int i=0; i<arr.length-k+1; i++)
    	{
    		double sum = 0;
    		for(int j=i; j<k+i; j++)
    		{
    			sum = sum+arr[j];
    		}
    		result[i] = sum/k;
    	}
    	return result;
  	}

  	//Optimized Sol
  	public static double[] findAveragesOptimized(int k, int[] arr) 
	{
    	double[] result = new double[arr.length - k + 1];
    	int windowStart = 0;
    	double sum = 0;

    	for(int windowEnd = 0; windowEnd<arr.length; windowEnd++)
    	{
    		sum = sum + arr[windowEnd];

    		if(windowEnd >= k-1)
    		{
    			result[windowStart] = sum/k;
    			sum = sum - arr[windowStart];
    			windowStart++;

    		}
    	}

    	return result;
  	}

  	public void result() 
  	{
    	double[] result = AverageOfSubarrayOfSize.findAverages(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
    	System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));

    	result = AverageOfSubarrayOfSize.findAveragesOptimized(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
    	System.out.println("Averages of subarrays of size K Optimized: " + Arrays.toString(result));
  	}
}