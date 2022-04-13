package bubbleSort;

public class BubbleSort{
    public int[] bubbleSort(int nums[]){
        //num = [8,5,7,3,25,0,1,5]
        int n=nums.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}