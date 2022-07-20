package Recursion.introRecursion;

public class FindOccurances {
    static int first = -1;
    static int last = -1;

    public static void findOccurances(String str, int idx, char element) {

        if (idx == str.length()) {
            System.out.println(first + "\n" + last);
            return;
        }

        char current = str.charAt(idx);
        if (current == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurances(str, idx + 1, element);
    }
}
