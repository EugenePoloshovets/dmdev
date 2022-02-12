package payau.core.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> integers = new ArrayList<>(list);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for (Integer integer : list) {
//            System.out.println(integer);
//        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        for (Iterator<Integer> iterator1 = integers.iterator(); iterator1.hasNext(); ) {
            Integer next = iterator1.next();
            if (next == 3 || next == 4) {
                iterator1.remove();
            }
        }
        System.out.println(integers);
    }
}
