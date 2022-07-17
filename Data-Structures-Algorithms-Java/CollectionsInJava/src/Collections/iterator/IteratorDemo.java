package Collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    // Used for concurrent modification issue fix
    public static void iteratorMethod() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("List: " + list);
        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            int element = itr.next();
            System.out.println("Element: " + element);
            if (element == 4) {
                itr.remove();
            }
        }
        System.out.println("New List: " + list);
    }

}
