package Problems;
import java.util.HashMap;


class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        //ArrayList<Integer> result = new ArrayList<>();
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++)
        {
            int complement = target - nums[i];
            if(hmap.containsKey(complement))
            {
                result[0] = i;
                result[1] = hmap.get(complement);
            }
            hmap.put(nums[i], i);
            
        }
        
        return result;
        
    }
}