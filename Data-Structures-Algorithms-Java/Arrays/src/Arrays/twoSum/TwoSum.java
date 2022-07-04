package Arrays.twoSum;

import java.util.HashMap;

public class TwoSum {

    public static int[] findSum(int[] nums, int target) {
        int result[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int complement = 0;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (map.containsKey(complement)) {
                result[0] = nums[i];
                result[1] = nums[map.get(complement)];
            } else {
                map.put(nums[i], i);
            }
        }
        return result; // parameter
    }
}
