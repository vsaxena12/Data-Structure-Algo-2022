package BasicArrayProblems;

public class RemoveEvenInteger {
    
    private static int[] removeEvenInteger_BruteForce(int[] arr){
        int count = 0;
        int i=0, j=0;
        for(i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                count++;
            }
        }
        int temp[] = new int[count];
        for(i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                temp[j++] = arr[i];
            }
        }
        arr = temp;
        return arr;
    }

    private static void print(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args){
        int arr[] = {1,2,4,5,10,6,3};
        print(removeEvenInteger_BruteForce(arr));
        //System.out.println("TEST");
    }
}
