package BasicLeetcodeProblems;
import java.util.Arrays;
import java.util.HashMap;

class ContainsDuplicate_BruteForce{
	
	
}

class ContainsDuplicate_Sorting{
	public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); //log n
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
} //O(n*log n)

class ContainsDuplicate_Hashing{
	public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}//O(n)

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,1};
		ContainsDuplicate_Sorting sort = new ContainsDuplicate_Sorting();
		System.out.println(sort.containsDuplicate(arr));
		
		ContainsDuplicate_Hashing hash = new ContainsDuplicate_Hashing();
		System.out.println(hash.containsDuplicate(arr));
		
	}

}
