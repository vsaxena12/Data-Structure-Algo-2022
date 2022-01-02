package BasicArrayProblems;

public class MergeTwoSortedArrays {

    private static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2){
        int arr3[] = new int[arr1.length+arr2.length];
        int i=0, j=0, k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                arr3[k++] = arr1[i++];
            }
            arr3[k++] = arr2[j++];
        }
        while(i<arr1.length){
            arr3[k++] = arr1[i++];
        }
        while(j<arr2.length){
            arr3[k++] = arr2[j++];
        }

        return arr3;
    }

    private static void print(int[] arr3){
        for(int i: arr3){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args){
        int arr1[] = {1,3,5,4,7,9,11,13,15};
        int arr2[] = {2,4,6,8,10};

        print(mergeTwoSortedArrays(arr1, arr2));
        //System.out.println("TEST");
    }
    
}
