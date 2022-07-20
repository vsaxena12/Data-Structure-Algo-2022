package Recursion.introRecursion;

public class IntroToRecursion {
    public static void printNumbers(int num) {
        if (num == 1000) {
            return;
        }
        System.out.println(num);
        printNumbers(num + 1);
        // System.out.println(num);
    }

    public static void sum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sum(i + 1, n, sum);
    }

    public static int factorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }

        return num * factorial(num - 1);
    }

    public static void fibonnaciSeries(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibonnaciSeries(b, c, n - 1);
    }

    public static int stackHeight(int x, int n) {
        if (n == 0) // base case 1
            return 1;
        if (x == 0) // base case 2
            return 0;
        return x * stackHeight(x, n - 1);
    }

    public static int stackHeightLog(int x, int n) {
        if (n == 0) // base case 1
            return 1;
        if (x == 0) // base case 2
            return 0;
        if (n % 2 == 0) { // for even
            return stackHeight(x, n / 2) * stackHeight(x, n / 2);
        } else { // for odd
            return x * stackHeight(x, n / 2) * stackHeight(x, n / 2);
        }

    }
}
