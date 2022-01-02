package WindowSliding.ProblemStatements;

class MaxSumSubArrayOfSizeK 
{
	public static int findMaxSumSubArray(int k, int[] arr) 
	{
	    // TODO: Write your code here
	    int windowStart = 0; //j
    	int windowEnd = 0; //i
    	int sum = 0;
    	int maxSum = 0;
    	while(windowEnd < arr.length)
    	{
      		sum = sum + arr[windowEnd];
      		
      		if(windowEnd >= k-1)
      		{
        		maxSum = Math.max(maxSum, sum);
        		sum = sum - arr[windowStart];
        		windowStart++;
      		}
      		
      		windowEnd++;
    	}
    	
    	return maxSum;
	}
}