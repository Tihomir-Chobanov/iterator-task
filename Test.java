package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            al.add(i);
        System.out.println(al);

        // At the beginning iterator(cursor) will point to
        // index just before the first element in al
        Iterator<Integer> iterator = al.iterator();

        // Checking the next element  where
        // condition holds true till there is single element
        // in the List using hasnext() method
        while (iterator.hasNext()) {
            //  Moving cursor to next element
            int i = iterator.next();
            System.out.print(i + " ");
            if (i % 2 != 0) iterator.remove();
        }
        System.out.println();
        System.out.println(al);
    }
}
