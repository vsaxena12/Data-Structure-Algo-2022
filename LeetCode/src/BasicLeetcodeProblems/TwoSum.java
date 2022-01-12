package BasicLeetcodeProblems;
import java.util.HashMap;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            int compliment = target - nums[i];
            System.out.println("Compliment: "+compliment);
            if(map.containsKey(compliment))
                return new int[]{map.get(compliment), i};
            map.put(nums[i], i);
        }
        return null;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
