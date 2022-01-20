package basicBinarySearchProblems;

public class SearchElement {
	
	static String findElement(int[] arr, int target) {
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			int mid = left + (right-left)/2;
			if(arr[mid] == target)
				return (mid+" "+arr[mid]);
			if(arr[mid]>target)
				right=mid-1;
			else
				left=mid+1;
		}
		return null;
	}
	
	public static void main(String args[]) {
		int arr[] = {2,5,8,12,16,23,38,56,72,91};
		int target = 2;
		for(int i: arr)
			System.out.println("arr: "+i);
		System.out.println("Element Found At: "+findElement(arr,target));
		
	}

}
