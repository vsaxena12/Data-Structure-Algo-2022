package leetcode_53;

public class MaximumSubArray {
	
	public static int maxSubArray(int[] nums) {
			int current = nums[0];
			int maxNum = nums[0];
			for(int i=1; i<nums.length; i++) {
				int num = nums[i];
				
				current = Math.max(num, current+num);
				maxNum = Math.max(maxNum, current);
			}
        	return maxNum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Maximum Sub Array");
		int arr[] = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println("Sub Array For {-2, 1, -3, 4, -1, 2, 1, -5, 4} -> "+maxSubArray(arr));
		
		arr = new int[]{5,4,-1,7,8};
		System.out.println("Sub Array For {5,4,-1,7,8} -> "+maxSubArray(arr));
		
	}

}
