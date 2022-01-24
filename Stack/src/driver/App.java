package driver;

import stack.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Stack!");
    
        System.out.println(reverseString("HELLO!"));

    }

    public static String reverseString(String str){
        int stackSize = str.length();
        Stack stack = new Stack(stackSize);

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            stack.push(ch);
        }
        String result = "";
        while(!stack.isEmpty()){
            char ch = (char) stack.pop();
            result = result + ch;
        }
        return result;
    }

    public static void stackData(long num){
        Stack s = new Stack(2);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        while(!s.isEmpty()){
            long valuePop = s.pop();
            System.out.println(valuePop+" -> top index: "+s.pop());
        }

        System.out.println("Stack element pop out is : "+s.pop());
    }
}
