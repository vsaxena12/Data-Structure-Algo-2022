package Arrays.checkRemoveEven;

public class CheckRemoveEven {
	public static long[] removeEven(long[] arr) {
		// Write - Your - Code- Here
		int newLength = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2 != 0){
				newLength++;
			}
		}
		long resultArray[] = new long[newLength];
		int j = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2 != 0){
				resultArray[j] = arr[i];
				j++;
			}
		}
		return resultArray; // change this and return the correct result array
        //Time complexity is O(n)
	}
}
