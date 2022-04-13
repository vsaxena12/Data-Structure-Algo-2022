public class Fibonacci {

    public static void fibo(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibo(b,c,n-1);
    }
    
    public static void main(String[] args){
        System.out.println("Fibonacci Series");
        int n=7;
        int a=0;
        int b=1;

        // System.out.println("Iteration Fibo \n");
        // System.out.println(a);
        // System.out.println(b);
        // for(int i=0; i<n-2; i++){
        //     int result = a + b;
        //     System.out.println(result);
        //     a = b;
        //     b = result;
        // }

        System.out.println("Recursion Fibo \n");
        System.out.println(a);
        System.out.println(b);
        fibo(a,b,n-2);

    }
}
