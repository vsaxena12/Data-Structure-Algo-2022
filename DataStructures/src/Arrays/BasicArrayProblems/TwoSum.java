import java.util.Arrays;

public class TwoSum {
    
    //Using brute force algo, it generates time complexity of O(n^2)
    public static int[] twoSum_BruteForceAlgo(int[] nums, int target){
        int result[] = new int[2];
        //Binary search works only on sorted arrays
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    //Using binary search algo, it generates time complexity of O(nlog n)
    public static int[] twoSum_BinarySearch(int[] nums, int target){
        Arrays.sort(nums);
        
        return nums;
    }

    private static void print(int[] result){
        for(int i: result){
            System.out.println(i);
        }
    }

    public static void main(String args[]){
        int nums[] = {2,22,7,15};
        int key = 9;
        
        System.out.println("--------------------Brute Force Algorithm--------------------");
        print(twoSum_BruteForceAlgo(nums, key));

        System.out.println("--------------------Binary Search--------------------");
        print(twoSum_BinarySearch(nums, key));

    }
}
