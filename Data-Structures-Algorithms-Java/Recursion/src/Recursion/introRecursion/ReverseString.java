package Recursion.introRecursion;

public class ReverseString {
    public static void reverseStringIteration(String str) {
        // str = hell;
        char ch;
        String reverseString = "";
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            reverseString = ch + reverseString;
        }
        System.out.println(reverseString);
    }

    public static void reverseStringRecursion(String str, int index) {
        // str = hell;
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        reverseStringRecursion(str, index - 1);
    }
}
