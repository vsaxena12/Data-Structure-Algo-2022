package Recursion.driver;

//import Recursion.introRecursion.FindOccurances;
//import Recursion.introRecursion.ReverseString;
//import Recursion.introRecursion.IntroToRecursion;
//import Recursion.introRecursion.TowerOfHanoi;

import Recursion.introRecursion.*;

public class Driver {

    public static void main(String args[]) {
        System.out.println("Recursion");
        // IntroToRecursion.printNumbers(1);
        // IntroToRecursion.sum(1, 5, 0);

        /*
         * int n = IntroToRecursion.factorial(5);
         * System.out.println(n);
         */

        /*
         * int a = 0;
         * int b = 1;
         * System.out.println(a);
         * System.out.println(b);
         * int n = 7;
         * IntroToRecursion.fibonnaciSeries(a, b, n - 2);
         */

        /*
         * int x = 2, n = 5;
         * int ans = IntroToRecursion.stackHeight(x, n);
         * System.out.println(ans);
         */

        // TowerOfHanoi.towerOfHanoi(3, "S", "H", "D");

        // ReverseString.reverseStringIteration("hello world");

        /*
         * String str = "hello";
         * ReverseString.reverseStringRecursion(str, str.length() - 1);
         */

        // FindOccurances.findOccurances("abaadfdfae", 0, 'a');
        // System.out.println(Sorted.isSorted(new int[] { 1, 2, 2, 4, 5 }, 0));

        // MoveTowardsEnd.moveTowardsEnd("axbcxx", 0, 0, 'x', "");

        RemoveDuplicate.removeDuplicate("axbcxxda", 0, "");
    }
}
