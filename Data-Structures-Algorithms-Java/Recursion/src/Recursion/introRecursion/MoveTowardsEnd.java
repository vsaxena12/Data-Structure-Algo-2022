package Recursion.introRecursion;

public class MoveTowardsEnd {
    public static void moveTowardsEnd(String str, int idx, int count, char element, String newString) {

        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString = newString + element;

            }
            System.out.println(newString);
            return;
        }
        if (str.charAt(idx) == element) {
            // System.out.println("if: " + str.charAt(idx));
            count++;
            moveTowardsEnd(str, idx + 1, count, element, newString);
        } else {
            newString = newString + str.charAt(idx);
            // System.out.println("else: " + str.charAt(idx));
            // System.out.println("else: " + newString);
            moveTowardsEnd(str, idx + 1, count, element, newString);
        }

    }
}
