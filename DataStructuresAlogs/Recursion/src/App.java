public class App {

    public static void print(int n){
        if(n == 6){
            return;
        }       
        System.out.println(n);
        print(n+1);
    }

    public static void printSum(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        
        sum += i;
        printSum(i+1, n, sum);
    }
    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int fibonacci(int a, int b, int n){
        a = 0;
        b = 1;
        int c = a+b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int count = 0;
        if(count == n)
            return n;

        
        return n;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Recursion");
        //print(1);
        //printSum(1,5,0);
        //System.out.println(factorial(5));
        //System.out.println(fibonacci(5));
    }
}
