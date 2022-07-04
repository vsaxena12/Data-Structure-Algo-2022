package Arrays.checkDoubleExists;

import java.util.HashSet;

public class CheckDoubleExists {
    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int element : arr) {
            if (set.contains(element * 2) || (element % 2 == 0 && set.contains(element / 2))) {
                System.out.println(element);
                return true;
            } else {
                set.add(element);
            }

        }
        return false;
    }
}
