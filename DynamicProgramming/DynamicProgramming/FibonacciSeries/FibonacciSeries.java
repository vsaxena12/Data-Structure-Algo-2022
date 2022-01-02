package FibonacciSeries;

public class FibonacciSeries {

	static int n = 1000;
	static long arr[] = new long[(int) (n+2)];
	
	/*
	 * public static int fibRecursion(long n) { if(n <= 1) return 1; return
	 * fibRecursion(n-1) + fibRecursion(n-2); }
	 */
	
	public static long fibDP(int n)
	{
		//arr[] = new long[(int) (n+2)];
		
		arr[0] = 0; 
		arr[1] = 1;
		
		for (int i = 2; i <= n; i++)
	    {
	       /* Add the previous 2 numbers in the series
	         and store it */
			arr[i] = arr[i-1] + arr[i-2];
	    }
			
		return arr[n];
	}
	
	public static long fibMemoization(int n)
	{
		//arr[] = new long[(int) (n+2)];
		if(n <= 1)
			return n;
		if(arr[n] != 0)
			return arr[n];
			
		return arr[n]=fibMemoization(n-1) + fibMemoization(n-2);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//System.out.println("Fibo Recursion: "+fibRecursion(50));
		
		//System.out.println("Fibo Dynamic Programming: "+fibDP(50));
		System.out.println("Fibo Dynamic Programming: "+fibMemoization(6));
	}

}
