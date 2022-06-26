package Arrays.driver;

import Arrays.checkRemoveEven.CheckRemoveEven;

public class Driver {
    public static void main(String args[]){
        System.out.println("Hello, World!");

        //Remove Even Integers from an Array
        int arr[] = {1, 2, 4, 5, 10, 6, 3};
        System.out.println("Odd Numbers: ");
        for(int element: CheckRemoveEven.removeEven(arr)){
            System.out.println(element);
        }
        
        
    }
}