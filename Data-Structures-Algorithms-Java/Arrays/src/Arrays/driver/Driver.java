package Arrays.driver;

import Arrays.checkRemoveEven.CheckRemoveEven;
import Arrays.twoSum.TwoSum;
import Arrays.checkDoubleExists.CheckDoubleExists;
import Arrays.checkMergeArray.CheckMergeArray;

public class Driver {
    public static void main(String args[]) {
        System.out.println("Hello, World!");
        // removeEvenIntegers();
        // mergeTwoArrays();
        // findSumVal();
        checkDouble();
    }

    public static void removeEvenIntegers() {
        // Remove Even Integers from an Array
        long arr[] = new long[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Numbers: ");
        for (long nums : arr) {
            System.out.print(nums + ", ");
        }

        System.out.println("Odd Numbers: ");
        for (long element : CheckRemoveEven.removeEven(arr)) {
            System.out.println(element);
        }
    }

    public static void mergeTwoArrays() {
        int arr1[] = { 1, 3, 4, 5, 11, 12, 13, 14, 15 };
        int arr2[] = { 2, 6, 7, 8, 9, 10 };
        System.out.println("Merged Array: ");

        for (int element : CheckMergeArray.mergeArrays(arr1, arr2)) {
            System.out.print(element + ", ");
        }

    }

    public static void findSumVal() {
        int arr[] = { 7, 2, 5, 7 };
        int target = 9;
        for (int val : TwoSum.findSum(arr, target)) {
            System.out.println(val);
        }

    }

    public static void checkDouble() {
        int arr[] = { 3, 1, 7, 11 };
        System.out.println(CheckDoubleExists.checkIfExist(arr));
    }
}