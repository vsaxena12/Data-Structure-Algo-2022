package Arrays.checkMergeArray;

public class CheckMergeArray {
    // merge arr1 and arr2 into a new result array
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // write your code here
        int length1 = arr1.length;
        int length2 = arr2.length;

        int i = 0;
        int j = 0;
        int k = 0;
        int resultantArray[] = new int[length1 + length2];

        while (i < length1 && j < length2) {
            if (arr1[i] < arr2[j]) {
                resultantArray[k++] = arr1[i++];
            } else {
                resultantArray[k++] = arr2[j++];
            }
        }

        while (i < length1) {
            resultantArray[k++] = arr1[i++];
        }

        while (j < length2) {
            resultantArray[k++] = arr2[j++];
        }

        return resultantArray; // make a new resultant array and return your results in that
    }
}
