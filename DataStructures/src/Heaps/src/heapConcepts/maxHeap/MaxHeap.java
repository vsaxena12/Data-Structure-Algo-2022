package heapConcepts.maxHeap;

public class MaxHeap
{
	public void test()
	{
		System.out.println("TEST");
	}

	public static void insert(int arr[], int n)
	{
		int temp, i=n;
		temp = arr[n];
		while(i>1 && temp > arr[i/2])
		{
			arr[i] = arr[i/2];
			i=i/2;
		}
		arr[i] = temp;

		

	}

	public void createheap()
	{
		int arr[] = new int[]{0,10,20,30,40,50,60,70};
		int i=0;
		for(i=2; i<7; i++)
		{
			insert(arr,i);
		}

		for(i=1; i<=7; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
