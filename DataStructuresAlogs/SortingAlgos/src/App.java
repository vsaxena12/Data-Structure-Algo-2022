import bubbleSort.*;
import insertionSort.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        BubbleSort bubbleSort = new BubbleSort();
        int nums[] = {8,5,7,3,25,0,1,5};
        int newNums[] = bubbleSort.bubbleSort(nums);
        System.out.println("Bubble Sort");
        for(int i: newNums){
            System.out.println(i);
        }
        System.out.println("Insertion Sort");
        InsertionSort insertionSort = new InsertionSort();
        int numsInsertion[] = {8,5,7,3,25,0,1,5};
        newNums = insertionSort.insertionSort(numsInsertion);
        for(int i: newNums){
            System.out.println(i);
        }
        
    }
}
